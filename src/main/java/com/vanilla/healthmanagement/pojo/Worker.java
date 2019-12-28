package com.vanilla.healthmanagement.pojo;

import java.util.Date;

public class Worker extends MyPage{
    private Integer id;

    private String workerName;

    private String workerPassword;

    private String workerPhone;

    private String workerWechat;

    private String workerMail;

    private String workerAddress;

    private String workerCard;

    private Integer workerSex;

    private String workerPhotourl;

    private String remarks;

    private Integer active;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerPassword() {
        return workerPassword;
    }

    public void setWorkerPassword(String workerPassword) {
        this.workerPassword = workerPassword == null ? null : workerPassword.trim();
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone == null ? null : workerPhone.trim();
    }

    public String getWorkerWechat() {
        return workerWechat;
    }

    public void setWorkerWechat(String workerWechat) {
        this.workerWechat = workerWechat == null ? null : workerWechat.trim();
    }

    public String getWorkerMail() {
        return workerMail;
    }

    public void setWorkerMail(String workerMail) {
        this.workerMail = workerMail == null ? null : workerMail.trim();
    }

    public String getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(String workerAddress) {
        this.workerAddress = workerAddress == null ? null : workerAddress.trim();
    }

    public String getWorkerCard() {
        return workerCard;
    }

    public void setWorkerCard(String workerCard) {
        this.workerCard = workerCard == null ? null : workerCard.trim();
    }

    public Integer getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(Integer workerSex) {
        this.workerSex = workerSex;
    }

    public String getWorkerPhotourl() {
        return workerPhotourl;
    }

    public void setWorkerPhotourl(String workerPhotourl) {
        this.workerPhotourl = workerPhotourl == null ? null : workerPhotourl.trim();
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
}