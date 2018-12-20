package com.yczn.mapper;

import com.yczn.pojo.dc.DcDishStyle;
import com.yczn.pojo.dc.DcDishStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DcDishStyleMapper {
    int countByExample(DcDishStyleExample example);

    int deleteByExample(DcDishStyleExample example);

    int deleteByPrimaryKey(Long dishstyleid);

    int insert(DcDishStyle record);

    int insertSelective(DcDishStyle record);

    List<DcDishStyle> selectByExample(DcDishStyleExample example);

    DcDishStyle selectByPrimaryKey(Long dishstyleid);

    int updateByExampleSelective(@Param("record") DcDishStyle record, @Param("example") DcDishStyleExample example);

    int updateByExample(@Param("record") DcDishStyle record, @Param("example") DcDishStyleExample example);

    int updateByPrimaryKeySelective(DcDishStyle record);

    int updateByPrimaryKey(DcDishStyle record);
}