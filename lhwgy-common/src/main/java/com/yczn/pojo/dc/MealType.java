package com.yczn.pojo.dc;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("DC_MealType")
public class MealType extends Model<MealType> {

    private static final long serialVersionUID = 1L;

    /**
     * 备注说明
     */
    @TableField("Notes")
    private String Notes;

    /**
     * 预留字段1
     */
    @TableField("F1")
    private String f1;

    /**
     * 预留字段2
     */
    @TableField("F2")
    private String f2;

    /**
     * 预留字段3
     */
    @TableField("F3")
    private String f3;

    /**
     * 数据状态,对应Syt_DataStatus表
     */
    @TableField("StatusID")
    private Integer StatusID;

    /**
     * 创建者ID
     */
    @TableField("CreateUserID")
    private Long CreateUserID;

    /**
     * 创建时间
     */
    @TableField("CreateDate")
    private Date CreateDate;

    /**
     * 修改者id
     */
    @TableField("ModifyUserID")
    private Long ModifyUserID;

    /**
     * 修改日期
     */
    @TableField("ModifyDate")
    private Date ModifyDate;

    @TableField("BeginTime")
    private String BeginTime;

    @TableId("MealTypeID")
    private Integer MealTypeID;

    @TableField("ShiTangID")
    private Long ShiTangID;

    @TableField("EndTime")
    private String EndTime;

    @TableField("MealName")
    private String MealName;


}
