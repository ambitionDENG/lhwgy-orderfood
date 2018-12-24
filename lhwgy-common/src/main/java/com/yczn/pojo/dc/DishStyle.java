package com.yczn.pojo.dc;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜式表
 * </p>
 *
 * @author yz
 * @since 2018-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("DC_DishStyle")
public class DishStyle extends Model<DishStyle> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜式编号
     */
    @TableField("DishStyleNo")
    private String DishStyleNo;

    /**
     * 菜式名称
     */
    @TableField("DishStyleName")
    private String DishStyleName;

    /**
     * 菜式单价
     */
    @TableField("Price")
    private BigDecimal Price;

    /**
     * 照片路径
     */
    @TableField("ImagePath")
    private String ImagePath;

    /**
     * 菜品类别
     */
    @TableField("FoodTypeID")
    private Long FoodTypeID;

    /**
     * 有效期始 MM-dd格式
     */
    @TableField("StartTime")
    private String StartTime;

    /**
     * 有效期止 MM-dd格式
     */
    @TableField("EndTime")
    private String EndTime;

    /**
     * 每餐最大份数
     */
    @TableField("MaxNum")
    private Integer MaxNum;

    @TableField("F2")
    private String f2;

    @TableField("Notes")
    private String Notes;

    @TableField("MealTypeID2")
    private Boolean MealTypeID2;

    @TableField("CreateUserID")
    private Long CreateUserID;

    @TableField("MealTypeID3")
    private Boolean MealTypeID3;

    @TableField("ModifyDate")
    private Date ModifyDate;

    @TableId(value = "DishStyleID", type = IdType.AUTO)
    private Long DishStyleID;

    @TableField("MealTypeID1")
    private Boolean MealTypeID1;

    @TableField("DishStyleCount")
    private Integer DishStyleCount;

    @TableField("DishStyleStatus")
    private Boolean DishStyleStatus;

    @TableField("ShiTangID")
    private Long ShiTangID;

    @TableField("CreateDate")
    private Date CreateDate;

    @TableField("F3")
    private String f3;

    @TableField("ModifyUserID")
    private Long ModifyUserID;

    @TableField("StatusID")
    private Integer StatusID;

    @TableField("F1")
    private String f1;

    @TableField("MealTypeID4")
    private Boolean MealTypeID4;


}
