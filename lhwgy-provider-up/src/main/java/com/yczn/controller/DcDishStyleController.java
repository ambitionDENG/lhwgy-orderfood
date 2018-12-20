package com.yczn.controller;

import com.yczn.pojo.dc.DcDishStyle;
import com.yczn.service.DcDishStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-20
 * @time: 11:16
 */
@RestController
public class DcDishStyleController {

    @Autowired
    private DcDishStyleService dcDishStyleService;
    @GetMapping("/{id}")
    public DcDishStyle findById(@PathVariable Long id) {
        DcDishStyle findOne = this.dcDishStyleService.selectByPrimaryKey(id);
        return findOne;
    }
}
