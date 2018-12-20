package com.yczn.service.impl;

import com.yczn.mapper.DcDishStyleMapper;
import com.yczn.pojo.dc.DcDishStyle;
import com.yczn.service.DcDishStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-20
 * @time: 11:13
 */
@Service
public class DcDishStyleServiceImpl implements DcDishStyleService {

    @Autowired
    private DcDishStyleMapper dcDishStyleMapper;

    @Override
    public DcDishStyle selectByPrimaryKey(Long dishstyleid) {
        return dcDishStyleMapper.selectByPrimaryKey(dishstyleid);
    }
}
