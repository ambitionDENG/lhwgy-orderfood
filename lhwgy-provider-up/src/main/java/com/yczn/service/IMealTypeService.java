package com.yczn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yczn.pojo.dc.MealType;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
public interface IMealTypeService extends IService<MealType> {
    MealType findShiTangName( String ShiTangName, String ShiTangNo);
}
