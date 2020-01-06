package com.mall.parking.finance.entity;

import java.util.Date;

public class Billing {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.member_id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.fee
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Float fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.plate_no
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String plateNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.duration
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Float duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.create_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.create_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.update_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.update_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.remark
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.version
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column billing.state
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.id
     *
     * @return the value of billing.id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.id
     *
     * @param id the value for billing.id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.member_id
     *
     * @return the value of billing.member_id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.member_id
     *
     * @param memberId the value for billing.member_id
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.fee
     *
     * @return the value of billing.fee
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Float getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.fee
     *
     * @param fee the value for billing.fee
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setFee(Float fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.plate_no
     *
     * @return the value of billing.plate_no
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.plate_no
     *
     * @param plateNo the value for billing.plate_no
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.duration
     *
     * @return the value of billing.duration
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.duration
     *
     * @param duration the value for billing.duration
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setDuration(Float duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.create_by
     *
     * @return the value of billing.create_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.create_by
     *
     * @param createBy the value for billing.create_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.create_date
     *
     * @return the value of billing.create_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.create_date
     *
     * @param createDate the value for billing.create_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.update_by
     *
     * @return the value of billing.update_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.update_by
     *
     * @param updateBy the value for billing.update_by
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.update_date
     *
     * @return the value of billing.update_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.update_date
     *
     * @param updateDate the value for billing.update_date
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.remark
     *
     * @return the value of billing.remark
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.remark
     *
     * @param remark the value for billing.remark
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.version
     *
     * @return the value of billing.version
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.version
     *
     * @param version the value for billing.version
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column billing.state
     *
     * @return the value of billing.state
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column billing.state
     *
     * @param state the value for billing.state
     *
     * @mbg.generated Mon Jan 06 13:07:41 CST 2020
     */
    public void setState(Integer state) {
        this.state = state;
    }
}