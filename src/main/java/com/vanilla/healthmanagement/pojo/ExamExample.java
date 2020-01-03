package com.vanilla.healthmanagement.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andExamHeightIsNull() {
            addCriterion("exam_height is null");
            return (Criteria) this;
        }

        public Criteria andExamHeightIsNotNull() {
            addCriterion("exam_height is not null");
            return (Criteria) this;
        }

        public Criteria andExamHeightEqualTo(Integer value) {
            addCriterion("exam_height =", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightNotEqualTo(Integer value) {
            addCriterion("exam_height <>", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightGreaterThan(Integer value) {
            addCriterion("exam_height >", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_height >=", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightLessThan(Integer value) {
            addCriterion("exam_height <", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightLessThanOrEqualTo(Integer value) {
            addCriterion("exam_height <=", value, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightIn(List<Integer> values) {
            addCriterion("exam_height in", values, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightNotIn(List<Integer> values) {
            addCriterion("exam_height not in", values, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightBetween(Integer value1, Integer value2) {
            addCriterion("exam_height between", value1, value2, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_height not between", value1, value2, "examHeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightIsNull() {
            addCriterion("exam_weight is null");
            return (Criteria) this;
        }

        public Criteria andExamWeightIsNotNull() {
            addCriterion("exam_weight is not null");
            return (Criteria) this;
        }

        public Criteria andExamWeightEqualTo(Integer value) {
            addCriterion("exam_weight =", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightNotEqualTo(Integer value) {
            addCriterion("exam_weight <>", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightGreaterThan(Integer value) {
            addCriterion("exam_weight >", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_weight >=", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightLessThan(Integer value) {
            addCriterion("exam_weight <", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightLessThanOrEqualTo(Integer value) {
            addCriterion("exam_weight <=", value, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightIn(List<Integer> values) {
            addCriterion("exam_weight in", values, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightNotIn(List<Integer> values) {
            addCriterion("exam_weight not in", values, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightBetween(Integer value1, Integer value2) {
            addCriterion("exam_weight between", value1, value2, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_weight not between", value1, value2, "examWeight");
            return (Criteria) this;
        }

        public Criteria andExamRsightIsNull() {
            addCriterion("exam_rsight is null");
            return (Criteria) this;
        }

        public Criteria andExamRsightIsNotNull() {
            addCriterion("exam_rsight is not null");
            return (Criteria) this;
        }

        public Criteria andExamRsightEqualTo(BigDecimal value) {
            addCriterion("exam_rsight =", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightNotEqualTo(BigDecimal value) {
            addCriterion("exam_rsight <>", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightGreaterThan(BigDecimal value) {
            addCriterion("exam_rsight >", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_rsight >=", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightLessThan(BigDecimal value) {
            addCriterion("exam_rsight <", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_rsight <=", value, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightIn(List<BigDecimal> values) {
            addCriterion("exam_rsight in", values, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightNotIn(List<BigDecimal> values) {
            addCriterion("exam_rsight not in", values, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_rsight between", value1, value2, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamRsightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_rsight not between", value1, value2, "examRsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightIsNull() {
            addCriterion("exam_lsight is null");
            return (Criteria) this;
        }

        public Criteria andExamLsightIsNotNull() {
            addCriterion("exam_lsight is not null");
            return (Criteria) this;
        }

        public Criteria andExamLsightEqualTo(BigDecimal value) {
            addCriterion("exam_lsight =", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightNotEqualTo(BigDecimal value) {
            addCriterion("exam_lsight <>", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightGreaterThan(BigDecimal value) {
            addCriterion("exam_lsight >", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_lsight >=", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightLessThan(BigDecimal value) {
            addCriterion("exam_lsight <", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_lsight <=", value, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightIn(List<BigDecimal> values) {
            addCriterion("exam_lsight in", values, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightNotIn(List<BigDecimal> values) {
            addCriterion("exam_lsight not in", values, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_lsight between", value1, value2, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamLsightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_lsight not between", value1, value2, "examLsight");
            return (Criteria) this;
        }

        public Criteria andExamHighbpIsNull() {
            addCriterion("exam_highbp is null");
            return (Criteria) this;
        }

        public Criteria andExamHighbpIsNotNull() {
            addCriterion("exam_highbp is not null");
            return (Criteria) this;
        }

        public Criteria andExamHighbpEqualTo(Integer value) {
            addCriterion("exam_highbp =", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpNotEqualTo(Integer value) {
            addCriterion("exam_highbp <>", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpGreaterThan(Integer value) {
            addCriterion("exam_highbp >", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_highbp >=", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpLessThan(Integer value) {
            addCriterion("exam_highbp <", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpLessThanOrEqualTo(Integer value) {
            addCriterion("exam_highbp <=", value, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpIn(List<Integer> values) {
            addCriterion("exam_highbp in", values, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpNotIn(List<Integer> values) {
            addCriterion("exam_highbp not in", values, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpBetween(Integer value1, Integer value2) {
            addCriterion("exam_highbp between", value1, value2, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamHighbpNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_highbp not between", value1, value2, "examHighbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpIsNull() {
            addCriterion("exam_lowbp is null");
            return (Criteria) this;
        }

        public Criteria andExamLowbpIsNotNull() {
            addCriterion("exam_lowbp is not null");
            return (Criteria) this;
        }

        public Criteria andExamLowbpEqualTo(Integer value) {
            addCriterion("exam_lowbp =", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpNotEqualTo(Integer value) {
            addCriterion("exam_lowbp <>", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpGreaterThan(Integer value) {
            addCriterion("exam_lowbp >", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_lowbp >=", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpLessThan(Integer value) {
            addCriterion("exam_lowbp <", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpLessThanOrEqualTo(Integer value) {
            addCriterion("exam_lowbp <=", value, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpIn(List<Integer> values) {
            addCriterion("exam_lowbp in", values, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpNotIn(List<Integer> values) {
            addCriterion("exam_lowbp not in", values, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpBetween(Integer value1, Integer value2) {
            addCriterion("exam_lowbp between", value1, value2, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamLowbpNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_lowbp not between", value1, value2, "examLowbp");
            return (Criteria) this;
        }

        public Criteria andExamGluIsNull() {
            addCriterion("exam_glu is null");
            return (Criteria) this;
        }

        public Criteria andExamGluIsNotNull() {
            addCriterion("exam_glu is not null");
            return (Criteria) this;
        }

        public Criteria andExamGluEqualTo(BigDecimal value) {
            addCriterion("exam_glu =", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluNotEqualTo(BigDecimal value) {
            addCriterion("exam_glu <>", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluGreaterThan(BigDecimal value) {
            addCriterion("exam_glu >", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_glu >=", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluLessThan(BigDecimal value) {
            addCriterion("exam_glu <", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exam_glu <=", value, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluIn(List<BigDecimal> values) {
            addCriterion("exam_glu in", values, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluNotIn(List<BigDecimal> values) {
            addCriterion("exam_glu not in", values, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_glu between", value1, value2, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamGluNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exam_glu not between", value1, value2, "examGlu");
            return (Criteria) this;
        }

        public Criteria andExamHrIsNull() {
            addCriterion("exam_hr is null");
            return (Criteria) this;
        }

        public Criteria andExamHrIsNotNull() {
            addCriterion("exam_hr is not null");
            return (Criteria) this;
        }

        public Criteria andExamHrEqualTo(Integer value) {
            addCriterion("exam_hr =", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrNotEqualTo(Integer value) {
            addCriterion("exam_hr <>", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrGreaterThan(Integer value) {
            addCriterion("exam_hr >", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_hr >=", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrLessThan(Integer value) {
            addCriterion("exam_hr <", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrLessThanOrEqualTo(Integer value) {
            addCriterion("exam_hr <=", value, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrIn(List<Integer> values) {
            addCriterion("exam_hr in", values, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrNotIn(List<Integer> values) {
            addCriterion("exam_hr not in", values, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrBetween(Integer value1, Integer value2) {
            addCriterion("exam_hr between", value1, value2, "examHr");
            return (Criteria) this;
        }

        public Criteria andExamHrNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_hr not between", value1, value2, "examHr");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("exam_date is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(Date value) {
            addCriterionForJDBCDate("exam_date =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exam_date <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(Date value) {
            addCriterionForJDBCDate("exam_date >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exam_date >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(Date value) {
            addCriterionForJDBCDate("exam_date <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exam_date <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<Date> values) {
            addCriterionForJDBCDate("exam_date in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exam_date not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exam_date between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exam_date not between", value1, value2, "examDate");
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