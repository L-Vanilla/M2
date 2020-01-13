package com.vanilla.healthmanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OlderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderExample() {
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

        public Criteria andOlderPasswordIsNull() {
            addCriterion("older_password is null");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordIsNotNull() {
            addCriterion("older_password is not null");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordEqualTo(String value) {
            addCriterion("older_password =", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordNotEqualTo(String value) {
            addCriterion("older_password <>", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordGreaterThan(String value) {
            addCriterion("older_password >", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("older_password >=", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordLessThan(String value) {
            addCriterion("older_password <", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordLessThanOrEqualTo(String value) {
            addCriterion("older_password <=", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordLike(String value) {
            addCriterion("older_password like", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordNotLike(String value) {
            addCriterion("older_password not like", value, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordIn(List<String> values) {
            addCriterion("older_password in", values, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordNotIn(List<String> values) {
            addCriterion("older_password not in", values, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordBetween(String value1, String value2) {
            addCriterion("older_password between", value1, value2, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderPasswordNotBetween(String value1, String value2) {
            addCriterion("older_password not between", value1, value2, "olderPassword");
            return (Criteria) this;
        }

        public Criteria andOlderSexIsNull() {
            addCriterion("older_sex is null");
            return (Criteria) this;
        }

        public Criteria andOlderSexIsNotNull() {
            addCriterion("older_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOlderSexEqualTo(Integer value) {
            addCriterion("older_sex =", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexNotEqualTo(Integer value) {
            addCriterion("older_sex <>", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexGreaterThan(Integer value) {
            addCriterion("older_sex >", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_sex >=", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexLessThan(Integer value) {
            addCriterion("older_sex <", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexLessThanOrEqualTo(Integer value) {
            addCriterion("older_sex <=", value, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexIn(List<Integer> values) {
            addCriterion("older_sex in", values, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexNotIn(List<Integer> values) {
            addCriterion("older_sex not in", values, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexBetween(Integer value1, Integer value2) {
            addCriterion("older_sex between", value1, value2, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderSexNotBetween(Integer value1, Integer value2) {
            addCriterion("older_sex not between", value1, value2, "olderSex");
            return (Criteria) this;
        }

        public Criteria andOlderCardIsNull() {
            addCriterion("older_card is null");
            return (Criteria) this;
        }

        public Criteria andOlderCardIsNotNull() {
            addCriterion("older_card is not null");
            return (Criteria) this;
        }

        public Criteria andOlderCardEqualTo(String value) {
            addCriterion("older_card =", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardNotEqualTo(String value) {
            addCriterion("older_card <>", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardGreaterThan(String value) {
            addCriterion("older_card >", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardGreaterThanOrEqualTo(String value) {
            addCriterion("older_card >=", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardLessThan(String value) {
            addCriterion("older_card <", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardLessThanOrEqualTo(String value) {
            addCriterion("older_card <=", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardLike(String value) {
            addCriterion("older_card like", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardNotLike(String value) {
            addCriterion("older_card not like", value, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardIn(List<String> values) {
            addCriterion("older_card in", values, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardNotIn(List<String> values) {
            addCriterion("older_card not in", values, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardBetween(String value1, String value2) {
            addCriterion("older_card between", value1, value2, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderCardNotBetween(String value1, String value2) {
            addCriterion("older_card not between", value1, value2, "olderCard");
            return (Criteria) this;
        }

        public Criteria andOlderAgeIsNull() {
            addCriterion("older_age is null");
            return (Criteria) this;
        }

        public Criteria andOlderAgeIsNotNull() {
            addCriterion("older_age is not null");
            return (Criteria) this;
        }

        public Criteria andOlderAgeEqualTo(Integer value) {
            addCriterion("older_age =", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeNotEqualTo(Integer value) {
            addCriterion("older_age <>", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeGreaterThan(Integer value) {
            addCriterion("older_age >", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_age >=", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeLessThan(Integer value) {
            addCriterion("older_age <", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeLessThanOrEqualTo(Integer value) {
            addCriterion("older_age <=", value, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeIn(List<Integer> values) {
            addCriterion("older_age in", values, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeNotIn(List<Integer> values) {
            addCriterion("older_age not in", values, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeBetween(Integer value1, Integer value2) {
            addCriterion("older_age between", value1, value2, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("older_age not between", value1, value2, "olderAge");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlIsNull() {
            addCriterion("older_photourl is null");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlIsNotNull() {
            addCriterion("older_photourl is not null");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlEqualTo(String value) {
            addCriterion("older_photourl =", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlNotEqualTo(String value) {
            addCriterion("older_photourl <>", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlGreaterThan(String value) {
            addCriterion("older_photourl >", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("older_photourl >=", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlLessThan(String value) {
            addCriterion("older_photourl <", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlLessThanOrEqualTo(String value) {
            addCriterion("older_photourl <=", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlLike(String value) {
            addCriterion("older_photourl like", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlNotLike(String value) {
            addCriterion("older_photourl not like", value, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlIn(List<String> values) {
            addCriterion("older_photourl in", values, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlNotIn(List<String> values) {
            addCriterion("older_photourl not in", values, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlBetween(String value1, String value2) {
            addCriterion("older_photourl between", value1, value2, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderPhotourlNotBetween(String value1, String value2) {
            addCriterion("older_photourl not between", value1, value2, "olderPhotourl");
            return (Criteria) this;
        }

        public Criteria andOlderAddressIsNull() {
            addCriterion("older_address is null");
            return (Criteria) this;
        }

        public Criteria andOlderAddressIsNotNull() {
            addCriterion("older_address is not null");
            return (Criteria) this;
        }

        public Criteria andOlderAddressEqualTo(String value) {
            addCriterion("older_address =", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressNotEqualTo(String value) {
            addCriterion("older_address <>", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressGreaterThan(String value) {
            addCriterion("older_address >", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("older_address >=", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressLessThan(String value) {
            addCriterion("older_address <", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressLessThanOrEqualTo(String value) {
            addCriterion("older_address <=", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressLike(String value) {
            addCriterion("older_address like", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressNotLike(String value) {
            addCriterion("older_address not like", value, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressIn(List<String> values) {
            addCriterion("older_address in", values, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressNotIn(List<String> values) {
            addCriterion("older_address not in", values, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressBetween(String value1, String value2) {
            addCriterion("older_address between", value1, value2, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderAddressNotBetween(String value1, String value2) {
            addCriterion("older_address not between", value1, value2, "olderAddress");
            return (Criteria) this;
        }

        public Criteria andOlderStateIsNull() {
            addCriterion("older_state is null");
            return (Criteria) this;
        }

        public Criteria andOlderStateIsNotNull() {
            addCriterion("older_state is not null");
            return (Criteria) this;
        }

        public Criteria andOlderStateEqualTo(Integer value) {
            addCriterion("older_state =", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotEqualTo(Integer value) {
            addCriterion("older_state <>", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateGreaterThan(Integer value) {
            addCriterion("older_state >", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_state >=", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateLessThan(Integer value) {
            addCriterion("older_state <", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateLessThanOrEqualTo(Integer value) {
            addCriterion("older_state <=", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateIn(List<Integer> values) {
            addCriterion("older_state in", values, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotIn(List<Integer> values) {
            addCriterion("older_state not in", values, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateBetween(Integer value1, Integer value2) {
            addCriterion("older_state between", value1, value2, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("older_state not between", value1, value2, "olderState");
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

        public Criteria andOlderPhoneIsNull() {
            addCriterion("older_phone is null");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneIsNotNull() {
            addCriterion("older_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneEqualTo(String value) {
            addCriterion("older_phone =", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneNotEqualTo(String value) {
            addCriterion("older_phone <>", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneGreaterThan(String value) {
            addCriterion("older_phone >", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("older_phone >=", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneLessThan(String value) {
            addCriterion("older_phone <", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneLessThanOrEqualTo(String value) {
            addCriterion("older_phone <=", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneLike(String value) {
            addCriterion("older_phone like", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneNotLike(String value) {
            addCriterion("older_phone not like", value, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneIn(List<String> values) {
            addCriterion("older_phone in", values, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneNotIn(List<String> values) {
            addCriterion("older_phone not in", values, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneBetween(String value1, String value2) {
            addCriterion("older_phone between", value1, value2, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderPhoneNotBetween(String value1, String value2) {
            addCriterion("older_phone not between", value1, value2, "olderPhone");
            return (Criteria) this;
        }

        public Criteria andOlderBmiIsNull() {
            addCriterion("older_bmi is null");
            return (Criteria) this;
        }

        public Criteria andOlderBmiIsNotNull() {
            addCriterion("older_bmi is not null");
            return (Criteria) this;
        }

        public Criteria andOlderBmiEqualTo(Integer value) {
            addCriterion("older_bmi =", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiNotEqualTo(Integer value) {
            addCriterion("older_bmi <>", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiGreaterThan(Integer value) {
            addCriterion("older_bmi >", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_bmi >=", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiLessThan(Integer value) {
            addCriterion("older_bmi <", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiLessThanOrEqualTo(Integer value) {
            addCriterion("older_bmi <=", value, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiIn(List<Integer> values) {
            addCriterion("older_bmi in", values, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiNotIn(List<Integer> values) {
            addCriterion("older_bmi not in", values, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiBetween(Integer value1, Integer value2) {
            addCriterion("older_bmi between", value1, value2, "olderBmi");
            return (Criteria) this;
        }

        public Criteria andOlderBmiNotBetween(Integer value1, Integer value2) {
            addCriterion("older_bmi not between", value1, value2, "olderBmi");
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