package com.sample;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @description
 * @author yz
 * @date 2018/12/19 11:02
 */
@Entity
@Table(name = "DC_MealType")
public class DcMealType {

  private long mealTypeId;
  private long shiTangId;
  private String mealName;
  private String beginTime;
  private String endTime;
  private String notes;
  private String f1;
  private String f2;
  private String f3;
  private long statusId;
  private long createUserId;
  private java.sql.Timestamp createDate;
  private long modifyUserId;
  private java.sql.Timestamp modifyDate;


  public long getMealTypeId() {
    return mealTypeId;
  }

  public void setMealTypeId(long mealTypeId) {
    this.mealTypeId = mealTypeId;
  }


  public long getShiTangId() {
    return shiTangId;
  }

  public void setShiTangId(long shiTangId) {
    this.shiTangId = shiTangId;
  }


  public String getMealName() {
    return mealName;
  }

  public void setMealName(String mealName) {
    this.mealName = mealName;
  }


  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public String getF1() {
    return f1;
  }

  public void setF1(String f1) {
    this.f1 = f1;
  }


  public String getF2() {
    return f2;
  }

  public void setF2(String f2) {
    this.f2 = f2;
  }


  public String getF3() {
    return f3;
  }

  public void setF3(String f3) {
    this.f3 = f3;
  }


  public long getStatusId() {
    return statusId;
  }

  public void setStatusId(long statusId) {
    this.statusId = statusId;
  }


  public long getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(long createUserId) {
    this.createUserId = createUserId;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public long getModifyUserId() {
    return modifyUserId;
  }

  public void setModifyUserId(long modifyUserId) {
    this.modifyUserId = modifyUserId;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }

}
