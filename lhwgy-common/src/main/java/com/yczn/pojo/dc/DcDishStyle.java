package com.yczn.pojo.dc;

import java.math.BigDecimal;
import java.util.Date;

public class DcDishStyle {
    private Long dishstyleid;

    private Long shitangid;

    private String dishstyleno;

    private String dishstylename;

    private BigDecimal price;

    private String imagepath;

    private Long foodtypeid;

    private Boolean mealtypeid1;

    private Boolean mealtypeid2;

    private Boolean mealtypeid3;

    private Boolean mealtypeid4;

    private String starttime;

    private String endtime;

    private Integer maxnum;

    private String notes;

    private Boolean dishstylestatus;

    private String f1;

    private String f2;

    private String f3;

    private Short statusid;

    private Long createuserid;

    private Date createdate;

    private Long modifyuserid;

    private Date modifydate;

    private Integer dishstylecount;

    public Long getDishstyleid() {
        return dishstyleid;
    }

    public void setDishstyleid(Long dishstyleid) {
        this.dishstyleid = dishstyleid;
    }

    public Long getShitangid() {
        return shitangid;
    }

    public void setShitangid(Long shitangid) {
        this.shitangid = shitangid;
    }

    public String getDishstyleno() {
        return dishstyleno;
    }

    public void setDishstyleno(String dishstyleno) {
        this.dishstyleno = dishstyleno == null ? null : dishstyleno.trim();
    }

    public String getDishstylename() {
        return dishstylename;
    }

    public void setDishstylename(String dishstylename) {
        this.dishstylename = dishstylename == null ? null : dishstylename.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public Long getFoodtypeid() {
        return foodtypeid;
    }

    public void setFoodtypeid(Long foodtypeid) {
        this.foodtypeid = foodtypeid;
    }

    public Boolean getMealtypeid1() {
        return mealtypeid1;
    }

    public void setMealtypeid1(Boolean mealtypeid1) {
        this.mealtypeid1 = mealtypeid1;
    }

    public Boolean getMealtypeid2() {
        return mealtypeid2;
    }

    public void setMealtypeid2(Boolean mealtypeid2) {
        this.mealtypeid2 = mealtypeid2;
    }

    public Boolean getMealtypeid3() {
        return mealtypeid3;
    }

    public void setMealtypeid3(Boolean mealtypeid3) {
        this.mealtypeid3 = mealtypeid3;
    }

    public Boolean getMealtypeid4() {
        return mealtypeid4;
    }

    public void setMealtypeid4(Boolean mealtypeid4) {
        this.mealtypeid4 = mealtypeid4;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Boolean getDishstylestatus() {
        return dishstylestatus;
    }

    public void setDishstylestatus(Boolean dishstylestatus) {
        this.dishstylestatus = dishstylestatus;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2 == null ? null : f2.trim();
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3 == null ? null : f3.trim();
    }

    public Short getStatusid() {
        return statusid;
    }

    public void setStatusid(Short statusid) {
        this.statusid = statusid;
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(Long modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getDishstylecount() {
        return dishstylecount;
    }

    public void setDishstylecount(Integer dishstylecount) {
        this.dishstylecount = dishstylecount;
    }
}