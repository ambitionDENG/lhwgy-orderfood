package com.yczn.service;

import com.yczn.pojo.dc.DcDishStyle;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-20
 * @time: 11:12
 */
public interface DcDishStyleService {
    DcDishStyle selectByPrimaryKey(Long dishstyleid);
}
