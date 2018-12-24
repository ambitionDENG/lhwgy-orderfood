package com.yczn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yczn.pojo.dc.DishStyle;

import java.util.List;

/**
 * <p>
 * 菜式表 服务类
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
public interface IDishStyleService extends IService<DishStyle> {
    List<DishStyle> findShiTangNameDcDishstyle(Integer ShiTangID, Integer MealTyleID);

}
