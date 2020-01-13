package com.vanilla.healthmanagement.pojo;

import java.io.Serializable;
import java.util.Date;

public class Aid extends MyPage implements Serializable {
    private Integer id;

    private Integer olderId;

    private String olderName;

    private Date aidDate;

    private String aidReason;

    private String aidRemarks;

    private Integer active;

    private Date createDate;

    private Integer rank;

    private Integer checkState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOlderId() {
        return olderId;
    }

    public void setOlderId(Integer olderId) {
        this.olderId = olderId;
    }

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName == null ? null : olderName.trim();
    }

    public Date getAidDate() {
        return aidDate;
    }

    public void setAidDate(Date aidDate) {
        this.aidDate = aidDate;
    }

    public String getAidReason() {
        return aidReason;
    }

    public void setAidReason(String aidReason) {
        this.aidReason = aidReason == null ? null : aidReason.trim();
    }

    public String getAidRemarks() {
        return aidRemarks;
    }

    public void setAidRemarks(String aidRemarks) {
        this.aidRemarks = aidRemarks == null ? null : aidRemarks.trim();
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }
}