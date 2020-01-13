package com.vanilla.healthmanagement.pojo;

import java.io.Serializable;
import java.util.Date;

public class Visits extends MyPage implements Serializable {
    private Integer id;

    private Integer olderId;

    private String olderName;

    private Integer workerId;

    private String workerName;

    private Date visitsDatetime;

    private String bodyState;

    private Integer visitsState;

    private String remarks;

    private String fileurl;

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

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public Date getVisitsDatetime() {
        return visitsDatetime;
    }

    public void setVisitsDatetime(Date visitsDatetime) {
        this.visitsDatetime = visitsDatetime;
    }

    public String getBodyState() {
        return bodyState;
    }

    public void setBodyState(String bodyState) {
        this.bodyState = bodyState == null ? null : bodyState.trim();
    }

    public Integer getVisitsState() {
        return visitsState;
    }

    public void setVisitsState(Integer visitsState) {
        this.visitsState = visitsState;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
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