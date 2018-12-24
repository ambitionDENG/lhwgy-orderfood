package com.yczn.mapper;

import com.yczn.pojo.dc.DishStyle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 菜式表 Mapper 接口
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Repository
public interface DishStyleMapper extends BaseMapper<DishStyle> {
    /**
     * @param ShiTangID  食堂id
     * @param MealTyleID
     * @return java.util.List<com.yczn.pojo.dc.DcDishstyle>
     * @description 查找今日 菜谱
     * @author yz
     * @date 2018/12/21 16:04
     * @method findShiTangNameDcDishstyle
     */
    @Select("select * from  DC_DishStyle " +
            "where case  when #{MealTyleID}=1 then MealTypeID1 " +
            "when #{MealTyleID}=2  then MealTypeID2 " +
            "when #{MealTyleID}=3  then MealTypeID3 " +
            "when #{MealTyleID}=4  then MealTypeID3 " +
            "end =1 and ShiTangID = #{ShiTangID} ")
    List<DishStyle> findShiTangNameDcDishstyle(@Param("ShiTangID") Integer ShiTangID, @Param("MealTyleID") Integer MealTyleID);

}
