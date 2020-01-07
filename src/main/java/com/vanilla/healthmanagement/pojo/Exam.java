package com.vanilla.healthmanagement.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Exam extends MyPage implements Serializable {
    private Integer id;

    private Integer olderId;

    private String olderName;

    private Integer examHeight;

    private Integer examWeight;

    private BigDecimal examRsight;

    private BigDecimal examLsight;

    private Integer examHighbp;

    private Integer examLowbp;

    private BigDecimal examGlu;

    private Integer examHr;

    private String remarks;

    private Date examDate;

    private Date createDate;

    private Integer active;

    /*根据时间查询参数*/
    private Date date1;
    private Date date2;

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

    public Integer getExamHeight() {
        return examHeight;
    }

    public void setExamHeight(Integer examHeight) {
        this.examHeight = examHeight;
    }

    public Integer getExamWeight() {
        return examWeight;
    }

    public void setExamWeight(Integer examWeight) {
        this.examWeight = examWeight;
    }

    public BigDecimal getExamRsight() {
        return examRsight;
    }

    public void setExamRsight(BigDecimal examRsight) {
        this.examRsight = examRsight;
    }

    public BigDecimal getExamLsight() {
        return examLsight;
    }

    public void setExamLsight(BigDecimal examLsight) {
        this.examLsight = examLsight;
    }

    public Integer getExamHighbp() {
        return examHighbp;
    }

    public void setExamHighbp(Integer examHighbp) {
        this.examHighbp = examHighbp;
    }

    public Integer getExamLowbp() {
        return examLowbp;
    }

    public void setExamLowbp(Integer examLowbp) {
        this.examLowbp = examLowbp;
    }

    public BigDecimal getExamGlu() {
        return examGlu;
    }

    public void setExamGlu(BigDecimal examGlu) {
        this.examGlu = examGlu;
    }

    public Integer getExamHr() {
        return examHr;
    }

    public void setExamHr(Integer examHr) {
        this.examHr = examHr;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
}