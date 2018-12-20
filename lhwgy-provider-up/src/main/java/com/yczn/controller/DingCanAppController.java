package com.yczn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-20
 * @time: 11:53
 */
@RestController
@RequestMapping("/food")
public class DingCanAppController {
    private static Logger logger = LoggerFactory.getLogger(DingCanAppController.class);


    @RequestMapping("/getUserOrderInfo")
    public Map<String, Object> getUserOrderInfo(HttpServletRequest request,
                                         HttpServletResponse response) {
     return null;
    }
}
