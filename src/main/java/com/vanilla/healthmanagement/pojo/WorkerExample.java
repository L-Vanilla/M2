package com.vanilla.healthmanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerExample() {
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

        public Criteria andWorkerNameIsNull() {
            addCriterion("worker_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("worker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("worker_name =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("worker_name <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("worker_name >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("worker_name >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("worker_name <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("worker_name <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("worker_name like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("worker_name not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("worker_name in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("worker_name not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("worker_name between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("worker_name not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIsNull() {
            addCriterion("worker_password is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIsNotNull() {
            addCriterion("worker_password is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordEqualTo(String value) {
            addCriterion("worker_password =", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotEqualTo(String value) {
            addCriterion("worker_password <>", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordGreaterThan(String value) {
            addCriterion("worker_password >", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("worker_password >=", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLessThan(String value) {
            addCriterion("worker_password <", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLessThanOrEqualTo(String value) {
            addCriterion("worker_password <=", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordLike(String value) {
            addCriterion("worker_password like", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotLike(String value) {
            addCriterion("worker_password not like", value, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordIn(List<String> values) {
            addCriterion("worker_password in", values, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotIn(List<String> values) {
            addCriterion("worker_password not in", values, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordBetween(String value1, String value2) {
            addCriterion("worker_password between", value1, value2, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPasswordNotBetween(String value1, String value2) {
            addCriterion("worker_password not between", value1, value2, "workerPassword");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNull() {
            addCriterion("worker_phone is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIsNotNull() {
            addCriterion("worker_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneEqualTo(String value) {
            addCriterion("worker_phone =", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotEqualTo(String value) {
            addCriterion("worker_phone <>", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThan(String value) {
            addCriterion("worker_phone >", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("worker_phone >=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThan(String value) {
            addCriterion("worker_phone <", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLessThanOrEqualTo(String value) {
            addCriterion("worker_phone <=", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneLike(String value) {
            addCriterion("worker_phone like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotLike(String value) {
            addCriterion("worker_phone not like", value, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneIn(List<String> values) {
            addCriterion("worker_phone in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotIn(List<String> values) {
            addCriterion("worker_phone not in", values, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneBetween(String value1, String value2) {
            addCriterion("worker_phone between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerPhoneNotBetween(String value1, String value2) {
            addCriterion("worker_phone not between", value1, value2, "workerPhone");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatIsNull() {
            addCriterion("worker_wechat is null");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatIsNotNull() {
            addCriterion("worker_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatEqualTo(String value) {
            addCriterion("worker_wechat =", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatNotEqualTo(String value) {
            addCriterion("worker_wechat <>", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatGreaterThan(String value) {
            addCriterion("worker_wechat >", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatGreaterThanOrEqualTo(String value) {
            addCriterion("worker_wechat >=", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatLessThan(String value) {
            addCriterion("worker_wechat <", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatLessThanOrEqualTo(String value) {
            addCriterion("worker_wechat <=", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatLike(String value) {
            addCriterion("worker_wechat like", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatNotLike(String value) {
            addCriterion("worker_wechat not like", value, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatIn(List<String> values) {
            addCriterion("worker_wechat in", values, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatNotIn(List<String> values) {
            addCriterion("worker_wechat not in", values, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatBetween(String value1, String value2) {
            addCriterion("worker_wechat between", value1, value2, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerWechatNotBetween(String value1, String value2) {
            addCriterion("worker_wechat not between", value1, value2, "workerWechat");
            return (Criteria) this;
        }

        public Criteria andWorkerMailIsNull() {
            addCriterion("worker_mail is null");
            return (Criteria) this;
        }

        public Criteria andWorkerMailIsNotNull() {
            addCriterion("worker_mail is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerMailEqualTo(String value) {
            addCriterion("worker_mail =", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailNotEqualTo(String value) {
            addCriterion("worker_mail <>", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailGreaterThan(String value) {
            addCriterion("worker_mail >", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailGreaterThanOrEqualTo(String value) {
            addCriterion("worker_mail >=", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailLessThan(String value) {
            addCriterion("worker_mail <", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailLessThanOrEqualTo(String value) {
            addCriterion("worker_mail <=", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailLike(String value) {
            addCriterion("worker_mail like", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailNotLike(String value) {
            addCriterion("worker_mail not like", value, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailIn(List<String> values) {
            addCriterion("worker_mail in", values, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailNotIn(List<String> values) {
            addCriterion("worker_mail not in", values, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailBetween(String value1, String value2) {
            addCriterion("worker_mail between", value1, value2, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerMailNotBetween(String value1, String value2) {
            addCriterion("worker_mail not between", value1, value2, "workerMail");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIsNull() {
            addCriterion("worker_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIsNotNull() {
            addCriterion("worker_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressEqualTo(String value) {
            addCriterion("worker_address =", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotEqualTo(String value) {
            addCriterion("worker_address <>", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressGreaterThan(String value) {
            addCriterion("worker_address >", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("worker_address >=", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLessThan(String value) {
            addCriterion("worker_address <", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLessThanOrEqualTo(String value) {
            addCriterion("worker_address <=", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressLike(String value) {
            addCriterion("worker_address like", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotLike(String value) {
            addCriterion("worker_address not like", value, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressIn(List<String> values) {
            addCriterion("worker_address in", values, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotIn(List<String> values) {
            addCriterion("worker_address not in", values, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressBetween(String value1, String value2) {
            addCriterion("worker_address between", value1, value2, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerAddressNotBetween(String value1, String value2) {
            addCriterion("worker_address not between", value1, value2, "workerAddress");
            return (Criteria) this;
        }

        public Criteria andWorkerCardIsNull() {
            addCriterion("worker_card is null");
            return (Criteria) this;
        }

        public Criteria andWorkerCardIsNotNull() {
            addCriterion("worker_card is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerCardEqualTo(String value) {
            addCriterion("worker_card =", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardNotEqualTo(String value) {
            addCriterion("worker_card <>", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardGreaterThan(String value) {
            addCriterion("worker_card >", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardGreaterThanOrEqualTo(String value) {
            addCriterion("worker_card >=", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardLessThan(String value) {
            addCriterion("worker_card <", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardLessThanOrEqualTo(String value) {
            addCriterion("worker_card <=", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardLike(String value) {
            addCriterion("worker_card like", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardNotLike(String value) {
            addCriterion("worker_card not like", value, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardIn(List<String> values) {
            addCriterion("worker_card in", values, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardNotIn(List<String> values) {
            addCriterion("worker_card not in", values, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardBetween(String value1, String value2) {
            addCriterion("worker_card between", value1, value2, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerCardNotBetween(String value1, String value2) {
            addCriterion("worker_card not between", value1, value2, "workerCard");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNull() {
            addCriterion("worker_sex is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("worker_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(Integer value) {
            addCriterion("worker_sex =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(Integer value) {
            addCriterion("worker_sex <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(Integer value) {
            addCriterion("worker_sex >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_sex >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(Integer value) {
            addCriterion("worker_sex <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(Integer value) {
            addCriterion("worker_sex <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<Integer> values) {
            addCriterion("worker_sex in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<Integer> values) {
            addCriterion("worker_sex not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(Integer value1, Integer value2) {
            addCriterion("worker_sex between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_sex not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlIsNull() {
            addCriterion("worker_photourl is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlIsNotNull() {
            addCriterion("worker_photourl is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlEqualTo(String value) {
            addCriterion("worker_photourl =", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlNotEqualTo(String value) {
            addCriterion("worker_photourl <>", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlGreaterThan(String value) {
            addCriterion("worker_photourl >", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("worker_photourl >=", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlLessThan(String value) {
            addCriterion("worker_photourl <", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlLessThanOrEqualTo(String value) {
            addCriterion("worker_photourl <=", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlLike(String value) {
            addCriterion("worker_photourl like", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlNotLike(String value) {
            addCriterion("worker_photourl not like", value, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlIn(List<String> values) {
            addCriterion("worker_photourl in", values, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlNotIn(List<String> values) {
            addCriterion("worker_photourl not in", values, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlBetween(String value1, String value2) {
            addCriterion("worker_photourl between", value1, value2, "workerPhotourl");
            return (Criteria) this;
        }

        public Criteria andWorkerPhotourlNotBetween(String value1, String value2) {
            addCriterion("worker_photourl not between", value1, value2, "workerPhotourl");
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