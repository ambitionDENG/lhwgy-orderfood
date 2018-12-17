package com.yczn.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-16
 * @time: 4:44
 */
@Controller
@Api("进入订餐首页")
public class IndexController {
    @ApiOperation("进入订餐首页")
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @Value("${driver}")
    private String from;

    @RequestMapping("/from")
    @ResponseBody
    public String from() {

        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
