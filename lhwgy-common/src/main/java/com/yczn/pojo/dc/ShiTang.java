package com.yczn.pojo.dc;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2018-12-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("DC_ShiTang")
public class ShiTang extends Model<ShiTang> {

    private static final long serialVersionUID = 1L;

    @TableField("Notes")
    private String Notes;

    @TableField("LinkMan")
    private String LinkMan;

    @TableField("Email")
    private String Email;

    @TableField("F3")
    private String f3;

    @TableField("ShiTangName")
    private String ShiTangName;

    @TableField("CreateDate")
    private Date CreateDate;

    @TableField("QQ")
    private String qq;

    @TableField("ShiTangStatus")
    private Boolean ShiTangStatus;

    @TableField("Tel")
    private String Tel;

    @TableField("AreaID")
    private Long AreaID;

    @TableField("StatusID")
    private Integer StatusID;

    @TableField("ShiTangNo")
    private String ShiTangNo;

    @TableField("ModifyUserID")
    private Long ModifyUserID;

    @TableField("F1")
    private String f1;

    @TableField("Addr")
    private String Addr;

    @TableField("ModifyDate")
    private Date ModifyDate;

    @TableField("F2")
    private String f2;

    @TableField("Fax")
    private String Fax;

    @TableField("CreateUserID")
    private Long CreateUserID;

    @TableId(value = "ShiTangID", type = IdType.AUTO)
    private Long ShiTangID;

    @TableField("Other")
    private String Other;


}
