package com.yczn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yczn.pojo.dc.MealType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Repository
public interface MealTypeMapper extends BaseMapper<MealType> {
    /**
     * @param ShiTangName 食堂名称
     * @param ShiTangNo   食堂编码
     * @return com.yczn.pojo.dc.DcMealtype
     * @description 根据食堂名字编码, 当前时间查找餐类
     * @author yz
     * @date 2018/12/21 12:11
     * @method findShiTangName
     */
    @Select("select MealTypeID from DC_MealType where ShiTangID = ( select ShiTangID from DC_ShiTang where ShiTangNo = #{ShiTangNo} and ShiTangName = #{ShiTangName} and ShiTangStatus = 1 ) " +
            "and  CONVERT(varchar(100), GETDATE(), 108) between beginTime and endTime ")
    MealType findShiTangName(@Param("ShiTangName") String ShiTangName, @Param("ShiTangNo") String ShiTangNo);
}
