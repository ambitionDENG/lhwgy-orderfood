package com.yczn.pojo.dc;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-19
 * @time: 18:01
 */
@Entity
@Table(name = "DC_DishStyle", schema = "dbo", catalog = "YCBZ_up6.0")
public class DcDishStyleEntity {
    private long dishStyleId;
    private long shiTangId;
    private String dishStyleNo;
    private String dishStyleName;
    private Object price;
    private String imagePath;
    private Long foodTypeId;
    private Boolean mealTypeId1;
    private Boolean mealTypeId2;
    private Boolean mealTypeId3;
    private Boolean mealTypeId4;
    private String startTime;
    private String endTime;
    private Integer maxNum;
    private String notes;
    private Boolean dishStyleStatus;
    private String f1;
    private String f2;
    private String f3;
    private Short statusId;
    private Long createUserId;
    private Timestamp createDate;
    private Long modifyUserId;
    private Timestamp modifyDate;
    private Integer dishStyleCount;

    @Id
    @Column(name = "DishStyleID")
    public long getDishStyleId() {
        return dishStyleId;
    }

    public void setDishStyleId(long dishStyleId) {
        this.dishStyleId = dishStyleId;
    }

    @Basic
    @Column(name = "ShiTangID")
    public long getShiTangId() {
        return shiTangId;
    }

    public void setShiTangId(long shiTangId) {
        this.shiTangId = shiTangId;
    }

    @Basic
    @Column(name = "DishStyleNo")
    public String getDishStyleNo() {
        return dishStyleNo;
    }

    public void setDishStyleNo(String dishStyleNo) {
        this.dishStyleNo = dishStyleNo;
    }

    @Basic
    @Column(name = "DishStyleName")
    public String getDishStyleName() {
        return dishStyleName;
    }

    public void setDishStyleName(String dishStyleName) {
        this.dishStyleName = dishStyleName;
    }

    @Basic
    @Column(name = "Price")
    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    @Basic
    @Column(name = "ImagePath")
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "FoodTypeID")
    public Long getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(Long foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    @Basic
    @Column(name = "MealTypeID1")
    public Boolean getMealTypeId1() {
        return mealTypeId1;
    }

    public void setMealTypeId1(Boolean mealTypeId1) {
        this.mealTypeId1 = mealTypeId1;
    }

    @Basic
    @Column(name = "MealTypeID2")
    public Boolean getMealTypeId2() {
        return mealTypeId2;
    }

    public void setMealTypeId2(Boolean mealTypeId2) {
        this.mealTypeId2 = mealTypeId2;
    }

    @Basic
    @Column(name = "MealTypeID3")
    public Boolean getMealTypeId3() {
        return mealTypeId3;
    }

    public void setMealTypeId3(Boolean mealTypeId3) {
        this.mealTypeId3 = mealTypeId3;
    }

    @Basic
    @Column(name = "MealTypeID4")
    public Boolean getMealTypeId4() {
        return mealTypeId4;
    }

    public void setMealTypeId4(Boolean mealTypeId4) {
        this.mealTypeId4 = mealTypeId4;
    }

    @Basic
    @Column(name = "StartTime")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "EndTime")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "MaxNum")
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    @Basic
    @Column(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "DishStyleStatus")
    public Boolean getDishStyleStatus() {
        return dishStyleStatus;
    }

    public void setDishStyleStatus(Boolean dishStyleStatus) {
        this.dishStyleStatus = dishStyleStatus;
    }

    @Basic
    @Column(name = "F1")
    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    @Basic
    @Column(name = "F2")
    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    @Basic
    @Column(name = "F3")
    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    @Basic
    @Column(name = "StatusID")
    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "CreateUserID")
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ModifyUserID")
    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Basic
    @Column(name = "ModifyDate")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "DishStyleCount")
    public Integer getDishStyleCount() {
        return dishStyleCount;
    }

    public void setDishStyleCount(Integer dishStyleCount) {
        this.dishStyleCount = dishStyleCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DcDishStyleEntity that = (DcDishStyleEntity) o;

        if (dishStyleId != that.dishStyleId) return false;
        if (shiTangId != that.shiTangId) return false;
        if (dishStyleNo != null ? !dishStyleNo.equals(that.dishStyleNo) : that.dishStyleNo != null) return false;
        if (dishStyleName != null ? !dishStyleName.equals(that.dishStyleName) : that.dishStyleName != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (imagePath != null ? !imagePath.equals(that.imagePath) : that.imagePath != null) return false;
        if (foodTypeId != null ? !foodTypeId.equals(that.foodTypeId) : that.foodTypeId != null) return false;
        if (mealTypeId1 != null ? !mealTypeId1.equals(that.mealTypeId1) : that.mealTypeId1 != null) return false;
        if (mealTypeId2 != null ? !mealTypeId2.equals(that.mealTypeId2) : that.mealTypeId2 != null) return false;
        if (mealTypeId3 != null ? !mealTypeId3.equals(that.mealTypeId3) : that.mealTypeId3 != null) return false;
        if (mealTypeId4 != null ? !mealTypeId4.equals(that.mealTypeId4) : that.mealTypeId4 != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (maxNum != null ? !maxNum.equals(that.maxNum) : that.maxNum != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (dishStyleStatus != null ? !dishStyleStatus.equals(that.dishStyleStatus) : that.dishStyleStatus != null)
            return false;
        if (f1 != null ? !f1.equals(that.f1) : that.f1 != null) return false;
        if (f2 != null ? !f2.equals(that.f2) : that.f2 != null) return false;
        if (f3 != null ? !f3.equals(that.f3) : that.f3 != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyUserId != null ? !modifyUserId.equals(that.modifyUserId) : that.modifyUserId != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (dishStyleCount != null ? !dishStyleCount.equals(that.dishStyleCount) : that.dishStyleCount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dishStyleId ^ (dishStyleId >>> 32));
        result = 31 * result + (int) (shiTangId ^ (shiTangId >>> 32));
        result = 31 * result + (dishStyleNo != null ? dishStyleNo.hashCode() : 0);
        result = 31 * result + (dishStyleName != null ? dishStyleName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (foodTypeId != null ? foodTypeId.hashCode() : 0);
        result = 31 * result + (mealTypeId1 != null ? mealTypeId1.hashCode() : 0);
        result = 31 * result + (mealTypeId2 != null ? mealTypeId2.hashCode() : 0);
        result = 31 * result + (mealTypeId3 != null ? mealTypeId3.hashCode() : 0);
        result = 31 * result + (mealTypeId4 != null ? mealTypeId4.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (maxNum != null ? maxNum.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (dishStyleStatus != null ? dishStyleStatus.hashCode() : 0);
        result = 31 * result + (f1 != null ? f1.hashCode() : 0);
        result = 31 * result + (f2 != null ? f2.hashCode() : 0);
        result = 31 * result + (f3 != null ? f3.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyUserId != null ? modifyUserId.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (dishStyleCount != null ? dishStyleCount.hashCode() : 0);
        return result;
    }
}
