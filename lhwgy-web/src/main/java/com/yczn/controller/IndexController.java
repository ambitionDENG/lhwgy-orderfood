package com.yczn.controller;

import com.yczn.feign.DcDishStyleFeign;
import com.yczn.toolkit.ReturnJsonTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-16
 * @time: 4:44
 */
@RestController
@Api(value = "订餐controller", tags = {"订餐首页管理"})
@RequestMapping("/shitang")
public class IndexController {
    @Autowired
    private DcDishStyleFeign dcDishStyleFeign;

    @ApiOperation("进入订餐首页")
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "返回菜品信息", tags = {"返回菜品信息"}, notes = "用于首页")
    @GetMapping("/todatFood")
    public ReturnJsonTemplate todatFood() {
        return dcDishStyleFeign.todatFood();
    }
}
