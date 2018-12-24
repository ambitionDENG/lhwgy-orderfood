package com.yczn.service.impl;

import com.yczn.pojo.dc.DishStyle;
import com.yczn.mapper.DishStyleMapper;
import com.yczn.service.IDishStyleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜式表 服务实现类
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Service
public class DishStyleServiceImpl extends ServiceImpl<DishStyleMapper, DishStyle> implements IDishStyleService {
    @Autowired
    private DishStyleMapper dishStyleMapper;

    @Override
    public List<DishStyle> findShiTangNameDcDishstyle(Integer ShiTangID, Integer MealTyleID) {
        return dishStyleMapper.findShiTangNameDcDishstyle(ShiTangID, MealTyleID);
    }

}
