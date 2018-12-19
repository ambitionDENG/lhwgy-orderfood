package com.yczn.pojo.dc;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yz
 * @description
 * @date 2018/12/18 18:04
 */
@Entity
@Table(name = "DC_DishStyle")
public class DcDishStyle implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -5809782578272943999L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    @Column
    private long dishStyleId;
    @Getter
    @Setter
    @Column
    private long shiTangId;
    @Getter
    @Setter
    @Column
    private String dishStyleNo;
    @Getter
    @Setter
    @Column
    private String dishStyleName;
    @Getter
    @Setter
    @Column
    private String price;
    @Getter
    @Setter
    @Column
    private String imagePath;
    @Getter
    @Setter
    @Column
    private long foodTypeId;
    @Getter
    @Setter
    @Column
    private String mealTypeId1;
    @Getter
    @Setter
    @Column
    private String mealTypeId2;
    @Getter
    @Setter
    @Column
    private String mealTypeId3;
    @Getter
    @Setter
    @Column
    private String mealTypeId4;
    @Getter
    @Setter
    @Column
    private String startTime;
    @Getter
    @Setter
    @Column
    private String endTime;
    @Getter
    @Setter
    @Column
    private long maxNum;
    @Getter
    @Setter
    @Column
    private String notes;
    @Getter
    @Setter
    @Column
    private String dishStyleStatus;
    @Getter
    @Setter
    @Column
    private String f1;
    @Getter
    @Setter
    @Column
    private String f2;
    @Getter
    @Setter
    @Column
    private String f3;
    @Getter
    @Setter
    @Column
    private long statusId;
    @Getter
    @Setter
    @Column
    private long createUserId;
    @Getter
    @Setter
    @Column
    private Date createDate;
    @Getter
    @Setter
    @Column
    private long modifyUserId;
    @Getter
    @Setter
    @Column
    private Date modifyDate;
    @Getter
    @Setter
    @Column
    private long dishStyleCount;

}
