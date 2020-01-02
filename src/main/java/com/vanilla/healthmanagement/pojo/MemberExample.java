package com.vanilla.healthmanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(Integer value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(Integer value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(Integer value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(Integer value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(Integer value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<Integer> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<Integer> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(Integer value1, Integer value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(Integer value1, Integer value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberRelationIsNull() {
            addCriterion("member_relation is null");
            return (Criteria) this;
        }

        public Criteria andMemberRelationIsNotNull() {
            addCriterion("member_relation is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRelationEqualTo(String value) {
            addCriterion("member_relation =", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationNotEqualTo(String value) {
            addCriterion("member_relation <>", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationGreaterThan(String value) {
            addCriterion("member_relation >", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationGreaterThanOrEqualTo(String value) {
            addCriterion("member_relation >=", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationLessThan(String value) {
            addCriterion("member_relation <", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationLessThanOrEqualTo(String value) {
            addCriterion("member_relation <=", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationLike(String value) {
            addCriterion("member_relation like", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationNotLike(String value) {
            addCriterion("member_relation not like", value, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationIn(List<String> values) {
            addCriterion("member_relation in", values, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationNotIn(List<String> values) {
            addCriterion("member_relation not in", values, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationBetween(String value1, String value2) {
            addCriterion("member_relation between", value1, value2, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberRelationNotBetween(String value1, String value2) {
            addCriterion("member_relation not between", value1, value2, "memberRelation");
            return (Criteria) this;
        }

        public Criteria andMemberCardIsNull() {
            addCriterion("member_card is null");
            return (Criteria) this;
        }

        public Criteria andMemberCardIsNotNull() {
            addCriterion("member_card is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCardEqualTo(String value) {
            addCriterion("member_card =", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardNotEqualTo(String value) {
            addCriterion("member_card <>", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardGreaterThan(String value) {
            addCriterion("member_card >", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardGreaterThanOrEqualTo(String value) {
            addCriterion("member_card >=", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardLessThan(String value) {
            addCriterion("member_card <", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardLessThanOrEqualTo(String value) {
            addCriterion("member_card <=", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardLike(String value) {
            addCriterion("member_card like", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardNotLike(String value) {
            addCriterion("member_card not like", value, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardIn(List<String> values) {
            addCriterion("member_card in", values, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardNotIn(List<String> values) {
            addCriterion("member_card not in", values, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardBetween(String value1, String value2) {
            addCriterion("member_card between", value1, value2, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberCardNotBetween(String value1, String value2) {
            addCriterion("member_card not between", value1, value2, "memberCard");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNull() {
            addCriterion("member_age is null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNotNull() {
            addCriterion("member_age is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeEqualTo(Integer value) {
            addCriterion("member_age =", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotEqualTo(Integer value) {
            addCriterion("member_age <>", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThan(Integer value) {
            addCriterion("member_age >", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_age >=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThan(Integer value) {
            addCriterion("member_age <", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThanOrEqualTo(Integer value) {
            addCriterion("member_age <=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIn(List<Integer> values) {
            addCriterion("member_age in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotIn(List<Integer> values) {
            addCriterion("member_age not in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeBetween(Integer value1, Integer value2) {
            addCriterion("member_age between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_age not between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNull() {
            addCriterion("member_phone is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIsNotNull() {
            addCriterion("member_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneEqualTo(String value) {
            addCriterion("member_phone =", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotEqualTo(String value) {
            addCriterion("member_phone <>", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThan(String value) {
            addCriterion("member_phone >", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_phone >=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThan(String value) {
            addCriterion("member_phone <", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLessThanOrEqualTo(String value) {
            addCriterion("member_phone <=", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneLike(String value) {
            addCriterion("member_phone like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotLike(String value) {
            addCriterion("member_phone not like", value, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneIn(List<String> values) {
            addCriterion("member_phone in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotIn(List<String> values) {
            addCriterion("member_phone not in", values, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneBetween(String value1, String value2) {
            addCriterion("member_phone between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNotBetween(String value1, String value2) {
            addCriterion("member_phone not between", value1, value2, "memberPhone");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNull() {
            addCriterion("member_address is null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNotNull() {
            addCriterion("member_address is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressEqualTo(String value) {
            addCriterion("member_address =", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotEqualTo(String value) {
            addCriterion("member_address <>", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThan(String value) {
            addCriterion("member_address >", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThanOrEqualTo(String value) {
            addCriterion("member_address >=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThan(String value) {
            addCriterion("member_address <", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThanOrEqualTo(String value) {
            addCriterion("member_address <=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLike(String value) {
            addCriterion("member_address like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotLike(String value) {
            addCriterion("member_address not like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIn(List<String> values) {
            addCriterion("member_address in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotIn(List<String> values) {
            addCriterion("member_address not in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressBetween(String value1, String value2) {
            addCriterion("member_address between", value1, value2, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotBetween(String value1, String value2) {
            addCriterion("member_address not between", value1, value2, "memberAddress");
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