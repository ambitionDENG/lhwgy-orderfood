package com.yczn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yczn.mapper.MealTypeMapper;
import com.yczn.pojo.dc.MealType;
import com.yczn.service.IMealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Service
public class MealTypeServiceImpl extends ServiceImpl<MealTypeMapper, MealType> implements IMealTypeService {

    @Autowired
    private MealTypeMapper mealTypeMapper;

    @Override
    public MealType findShiTangName(String ShiTangName, String ShiTangNo) {
        return mealTypeMapper.findShiTangName(ShiTangName, ShiTangNo);
    }
}
