package com.vanilla.healthmanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiagnosisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnosisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOlderIdIsNull() {
            addCriterion("older_id is null");
            return (Criteria) this;
        }

        public Criteria andOlderIdIsNotNull() {
            addCriterion("older_id is not null");
            return (Criteria) this;
        }

        public Criteria andOlderIdEqualTo(Integer value) {
            addCriterion("older_id =", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotEqualTo(Integer value) {
            addCriterion("older_id <>", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThan(Integer value) {
            addCriterion("older_id >", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_id >=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThan(Integer value) {
            addCriterion("older_id <", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThanOrEqualTo(Integer value) {
            addCriterion("older_id <=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdIn(List<Integer> values) {
            addCriterion("older_id in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotIn(List<Integer> values) {
            addCriterion("older_id not in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdBetween(Integer value1, Integer value2) {
            addCriterion("older_id between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("older_id not between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderNameIsNull() {
            addCriterion("older_name is null");
            return (Criteria) this;
        }

        public Criteria andOlderNameIsNotNull() {
            addCriterion("older_name is not null");
            return (Criteria) this;
        }

        public Criteria andOlderNameEqualTo(String value) {
            addCriterion("older_name =", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameNotEqualTo(String value) {
            addCriterion("older_name <>", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameGreaterThan(String value) {
            addCriterion("older_name >", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameGreaterThanOrEqualTo(String value) {
            addCriterion("older_name >=", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameLessThan(String value) {
            addCriterion("older_name <", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameLessThanOrEqualTo(String value) {
            addCriterion("older_name <=", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameLike(String value) {
            addCriterion("older_name like", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameNotLike(String value) {
            addCriterion("older_name not like", value, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameIn(List<String> values) {
            addCriterion("older_name in", values, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameNotIn(List<String> values) {
            addCriterion("older_name not in", values, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameBetween(String value1, String value2) {
            addCriterion("older_name between", value1, value2, "olderName");
            return (Criteria) this;
        }

        public Criteria andOlderNameNotBetween(String value1, String value2) {
            addCriterion("older_name not between", value1, value2, "olderName");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIsNull() {
            addCriterion("diagnosis_date is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIsNotNull() {
            addCriterion("diagnosis_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date =", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date <>", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateGreaterThan(Date value) {
            addCriterionForJDBCDate("diagnosis_date >", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date >=", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateLessThan(Date value) {
            addCriterionForJDBCDate("diagnosis_date <", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnosis_date <=", value, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosis_date in", values, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diagnosis_date not in", values, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosis_date between", value1, value2, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnosis_date not between", value1, value2, "diagnosisDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalIsNull() {
            addCriterion("diagnosis_hospital is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalIsNotNull() {
            addCriterion("diagnosis_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalEqualTo(String value) {
            addCriterion("diagnosis_hospital =", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalNotEqualTo(String value) {
            addCriterion("diagnosis_hospital <>", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalGreaterThan(String value) {
            addCriterion("diagnosis_hospital >", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_hospital >=", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalLessThan(String value) {
            addCriterion("diagnosis_hospital <", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_hospital <=", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalLike(String value) {
            addCriterion("diagnosis_hospital like", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalNotLike(String value) {
            addCriterion("diagnosis_hospital not like", value, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalIn(List<String> values) {
            addCriterion("diagnosis_hospital in", values, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalNotIn(List<String> values) {
            addCriterion("diagnosis_hospital not in", values, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalBetween(String value1, String value2) {
            addCriterion("diagnosis_hospital between", value1, value2, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisHospitalNotBetween(String value1, String value2) {
            addCriterion("diagnosis_hospital not between", value1, value2, "diagnosisHospital");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksIsNull() {
            addCriterion("diagnosis_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksIsNotNull() {
            addCriterion("diagnosis_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksEqualTo(String value) {
            addCriterion("diagnosis_remarks =", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksNotEqualTo(String value) {
            addCriterion("diagnosis_remarks <>", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksGreaterThan(String value) {
            addCriterion("diagnosis_remarks >", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_remarks >=", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksLessThan(String value) {
            addCriterion("diagnosis_remarks <", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_remarks <=", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksLike(String value) {
            addCriterion("diagnosis_remarks like", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksNotLike(String value) {
            addCriterion("diagnosis_remarks not like", value, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksIn(List<String> values) {
            addCriterion("diagnosis_remarks in", values, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksNotIn(List<String> values) {
            addCriterion("diagnosis_remarks not in", values, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksBetween(String value1, String value2) {
            addCriterion("diagnosis_remarks between", value1, value2, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisRemarksNotBetween(String value1, String value2) {
            addCriterion("diagnosis_remarks not between", value1, value2, "diagnosisRemarks");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationIsNull() {
            addCriterion("diagnosis_information is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationIsNotNull() {
            addCriterion("diagnosis_information is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationEqualTo(String value) {
            addCriterion("diagnosis_information =", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationNotEqualTo(String value) {
            addCriterion("diagnosis_information <>", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationGreaterThan(String value) {
            addCriterion("diagnosis_information >", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_information >=", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationLessThan(String value) {
            addCriterion("diagnosis_information <", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_information <=", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationLike(String value) {
            addCriterion("diagnosis_information like", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationNotLike(String value) {
            addCriterion("diagnosis_information not like", value, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationIn(List<String> values) {
            addCriterion("diagnosis_information in", values, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationNotIn(List<String> values) {
            addCriterion("diagnosis_information not in", values, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationBetween(String value1, String value2) {
            addCriterion("diagnosis_information between", value1, value2, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInformationNotBetween(String value1, String value2) {
            addCriterion("diagnosis_information not between", value1, value2, "diagnosisInformation");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNull() {
            addCriterion("check_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckStateIsNotNull() {
            addCriterion("check_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStateEqualTo(Integer value) {
            addCriterion("check_state =", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotEqualTo(Integer value) {
            addCriterion("check_state <>", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThan(Integer value) {
            addCriterion("check_state >", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_state >=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThan(Integer value) {
            addCriterion("check_state <", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateLessThanOrEqualTo(Integer value) {
            addCriterion("check_state <=", value, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateIn(List<Integer> values) {
            addCriterion("check_state in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotIn(List<Integer> values) {
            addCriterion("check_state not in", values, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateBetween(Integer value1, Integer value2) {
            addCriterion("check_state between", value1, value2, "checkState");
            return (Criteria) this;
        }

        public Criteria andCheckStateNotBetween(Integer value1, Integer value2) {
            addCriterion("check_state not between", value1, value2, "checkState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}