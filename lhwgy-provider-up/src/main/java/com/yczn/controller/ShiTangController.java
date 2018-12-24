package com.yczn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yczn.base.BaseController;
import com.yczn.pojo.dc.DishStyle;
import com.yczn.pojo.dc.MealType;
import com.yczn.pojo.dc.ShiTang;

import com.yczn.properties.ShiTangProperties;
import com.yczn.service.IDishStyleService;
import com.yczn.service.IMealTypeService;
import com.yczn.service.IShiTangService;
import com.yczn.toolkit.ReturnJsonTemplate;
import com.yczn.toolkit.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yz
 * @since 2018-12-23
 */
@RestController
@RequestMapping("/shitang")
public class ShiTangController extends BaseController {

    public final static Logger LOGGER = LoggerFactory.getLogger(ShiTangController.class);


    @Autowired
    private IMealTypeService iMealTypeService;

    @Autowired
    private IDishStyleService iDishStyleService;

    @Autowired
    private IShiTangService iShiTangService;

    @Autowired
    private ShiTangProperties shiTangProperties;

    @GetMapping("/todatFood")
    public ReturnJsonTemplate todatFood() {
        try {
            QueryWrapper<ShiTang> queryWrapper = new QueryWrapper<ShiTang>().eq("ShiTangNo", shiTangProperties.getShiTangNo()).eq("ShiTangName", shiTangProperties.getShiTangName());
            //查出当前食堂
            ShiTang shiTang = iShiTangService.getOne(queryWrapper);
            //查询当前是餐类
            MealType dcMealtype = iMealTypeService.findShiTangName(shiTangProperties.getShiTangName(), shiTangProperties.getShiTangNo());
            if (null == shiTang) {
                LOGGER.warn("Class: ShiTangController Method:todatFood Info:无此食堂!配置信息有误!");
                return new ReturnJsonTemplate("无此食堂!配置信息有误!", 405, null);
            }
            List<DishStyle> dishStyleList = iDishStyleService.findShiTangNameDcDishstyle(Integer.parseInt(shiTang.getShiTangID().toString()), dcMealtype.getMealTypeID());
            if (dishStyleList.isEmpty()) {
                LOGGER.warn("Class: ShiTangController Method:todatFood Info:当前没有菜品信息!");
                return new ReturnJsonTemplate("当前没有菜品信息!", 405, null);
            }
            ReturnJsonTemplate returnJsonTemplate = new ReturnJsonTemplate("调用成功!", 200, dishStyleList);
            return returnJsonTemplate;
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.warn("Class: ShiTangController Method:todatFood Info:" + StringUtils.removeRN(e.getMessage()));
            return new ReturnJsonTemplate("程序异常!", 500, null);
        }
    }
}
