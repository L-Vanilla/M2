package com.vanilla.healthmanagement.pojo;

import java.io.Serializable;
import java.util.Date;

public class Diagnosis extends MyPage implements Serializable {
    private Integer id;

    private Integer olderId;

    private String olderName;

    private Date diagnosisDate;

    private String diagnosisHospital;

    private String diagnosisRemarks;

    private String diagnosisInformation;

    private Date createDate;

    private Integer active;

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

    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public String getDiagnosisHospital() {
        return diagnosisHospital;
    }

    public void setDiagnosisHospital(String diagnosisHospital) {
        this.diagnosisHospital = diagnosisHospital == null ? null : diagnosisHospital.trim();
    }

    public String getDiagnosisRemarks() {
        return diagnosisRemarks;
    }

    public void setDiagnosisRemarks(String diagnosisRemarks) {
        this.diagnosisRemarks = diagnosisRemarks == null ? null : diagnosisRemarks.trim();
    }

    public String getDiagnosisInformation() {
        return diagnosisInformation;
    }

    public void setDiagnosisInformation(String diagnosisInformation) {
        this.diagnosisInformation = diagnosisInformation == null ? null : diagnosisInformation.trim();
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
}