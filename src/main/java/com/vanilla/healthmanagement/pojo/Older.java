package com.vanilla.healthmanagement.pojo;

import java.util.Date;

public class Older extends MyPage{
    private Integer id;

    private String olderName;

    private String olderPassword;

    private Integer olderSex;

    private String olderCard;

    private Integer olderAge;

    private String olderPhotourl;

    private String olderAddress;

    private Integer olderState;

    private String remarks;

    private Integer active;

    private Date createDate;

    private String olderPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName == null ? null : olderName.trim();
    }

    public String getOlderPassword() {
        return olderPassword;
    }

    public void setOlderPassword(String olderPassword) {
        this.olderPassword = olderPassword == null ? null : olderPassword.trim();
    }

    public Integer getOlderSex() {
        return olderSex;
    }

    public void setOlderSex(Integer olderSex) {
        this.olderSex = olderSex;
    }

    public String getOlderCard() {
        return olderCard;
    }

    public void setOlderCard(String olderCard) {
        this.olderCard = olderCard == null ? null : olderCard.trim();
    }

    public Integer getOlderAge() {
        return olderAge;
    }

    public void setOlderAge(Integer olderAge) {
        this.olderAge = olderAge;
    }

    public String getOlderPhotourl() {
        return olderPhotourl;
    }

    public void setOlderPhotourl(String olderPhotourl) {
        this.olderPhotourl = olderPhotourl == null ? null : olderPhotourl.trim();
    }

    public String getOlderAddress() {
        return olderAddress;
    }

    public void setOlderAddress(String olderAddress) {
        this.olderAddress = olderAddress == null ? null : olderAddress.trim();
    }

    public Integer getOlderState() {
        return olderState;
    }

    public void setOlderState(Integer olderState) {
        this.olderState = olderState;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getOlderPhone() {
        return olderPhone;
    }

    public void setOlderPhone(String olderPhone) {
        this.olderPhone = olderPhone == null ? null : olderPhone.trim();
    }
}