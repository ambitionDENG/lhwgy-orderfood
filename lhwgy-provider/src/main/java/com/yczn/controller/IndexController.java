package com.yczn.controller;

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
public class IndexController {
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
