package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseImageAuditPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseImageAuditPOExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(Integer value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(Integer value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(Integer value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(Integer value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(Integer value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<Integer> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<Integer> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(Integer value1, Integer value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andImgkeyIsNull() {
            addCriterion("imgKey is null");
            return (Criteria) this;
        }

        public Criteria andImgkeyIsNotNull() {
            addCriterion("imgKey is not null");
            return (Criteria) this;
        }

        public Criteria andImgkeyEqualTo(String value) {
            addCriterion("imgKey =", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyNotEqualTo(String value) {
            addCriterion("imgKey <>", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyGreaterThan(String value) {
            addCriterion("imgKey >", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyGreaterThanOrEqualTo(String value) {
            addCriterion("imgKey >=", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyLessThan(String value) {
            addCriterion("imgKey <", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyLessThanOrEqualTo(String value) {
            addCriterion("imgKey <=", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyLike(String value) {
            addCriterion("imgKey like", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyNotLike(String value) {
            addCriterion("imgKey not like", value, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyIn(List<String> values) {
            addCriterion("imgKey in", values, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyNotIn(List<String> values) {
            addCriterion("imgKey not in", values, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyBetween(String value1, String value2) {
            addCriterion("imgKey between", value1, value2, "imgkey");
            return (Criteria) this;
        }

        public Criteria andImgkeyNotBetween(String value1, String value2) {
            addCriterion("imgKey not between", value1, value2, "imgkey");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTakephototimeIsNull() {
            addCriterion("takePhotoTime is null");
            return (Criteria) this;
        }

        public Criteria andTakephototimeIsNotNull() {
            addCriterion("takePhotoTime is not null");
            return (Criteria) this;
        }

        public Criteria andTakephototimeEqualTo(Date value) {
            addCriterion("takePhotoTime =", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeNotEqualTo(Date value) {
            addCriterion("takePhotoTime <>", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeGreaterThan(Date value) {
            addCriterion("takePhotoTime >", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeGreaterThanOrEqualTo(Date value) {
            addCriterion("takePhotoTime >=", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeLessThan(Date value) {
            addCriterion("takePhotoTime <", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeLessThanOrEqualTo(Date value) {
            addCriterion("takePhotoTime <=", value, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeIn(List<Date> values) {
            addCriterion("takePhotoTime in", values, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeNotIn(List<Date> values) {
            addCriterion("takePhotoTime not in", values, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeBetween(Date value1, Date value2) {
            addCriterion("takePhotoTime between", value1, value2, "takephototime");
            return (Criteria) this;
        }

        public Criteria andTakephototimeNotBetween(Date value1, Date value2) {
            addCriterion("takePhotoTime not between", value1, value2, "takephototime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNull() {
            addCriterion("sourceId is null");
            return (Criteria) this;
        }

        public Criteria andSourceidIsNotNull() {
            addCriterion("sourceId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceidEqualTo(Integer value) {
            addCriterion("sourceId =", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotEqualTo(Integer value) {
            addCriterion("sourceId <>", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThan(Integer value) {
            addCriterion("sourceId >", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceId >=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThan(Integer value) {
            addCriterion("sourceId <", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidLessThanOrEqualTo(Integer value) {
            addCriterion("sourceId <=", value, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidIn(List<Integer> values) {
            addCriterion("sourceId in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotIn(List<Integer> values) {
            addCriterion("sourceId not in", values, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidBetween(Integer value1, Integer value2) {
            addCriterion("sourceId between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andSourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceId not between", value1, value2, "sourceid");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("agentId is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("agentId is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(Long value) {
            addCriterion("agentId =", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(Long value) {
            addCriterion("agentId <>", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(Long value) {
            addCriterion("agentId >", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(Long value) {
            addCriterion("agentId >=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(Long value) {
            addCriterion("agentId <", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(Long value) {
            addCriterion("agentId <=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<Long> values) {
            addCriterion("agentId in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<Long> values) {
            addCriterion("agentId not in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(Long value1, Long value2) {
            addCriterion("agentId between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(Long value1, Long value2) {
            addCriterion("agentId not between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNull() {
            addCriterion("rejectreason is null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNotNull() {
            addCriterion("rejectreason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonEqualTo(String value) {
            addCriterion("rejectreason =", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotEqualTo(String value) {
            addCriterion("rejectreason <>", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThan(String value) {
            addCriterion("rejectreason >", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("rejectreason >=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThan(String value) {
            addCriterion("rejectreason <", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThanOrEqualTo(String value) {
            addCriterion("rejectreason <=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLike(String value) {
            addCriterion("rejectreason like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotLike(String value) {
            addCriterion("rejectreason not like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIn(List<String> values) {
            addCriterion("rejectreason in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotIn(List<String> values) {
            addCriterion("rejectreason not in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonBetween(String value1, String value2) {
            addCriterion("rejectreason between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotBetween(String value1, String value2) {
            addCriterion("rejectreason not between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andBatchtimeIsNull() {
            addCriterion("batchTime is null");
            return (Criteria) this;
        }

        public Criteria andBatchtimeIsNotNull() {
            addCriterion("batchTime is not null");
            return (Criteria) this;
        }

        public Criteria andBatchtimeEqualTo(Date value) {
            addCriterion("batchTime =", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeNotEqualTo(Date value) {
            addCriterion("batchTime <>", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeGreaterThan(Date value) {
            addCriterion("batchTime >", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("batchTime >=", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeLessThan(Date value) {
            addCriterion("batchTime <", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeLessThanOrEqualTo(Date value) {
            addCriterion("batchTime <=", value, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeIn(List<Date> values) {
            addCriterion("batchTime in", values, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeNotIn(List<Date> values) {
            addCriterion("batchTime not in", values, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeBetween(Date value1, Date value2) {
            addCriterion("batchTime between", value1, value2, "batchtime");
            return (Criteria) this;
        }

        public Criteria andBatchtimeNotBetween(Date value1, Date value2) {
            addCriterion("batchTime not between", value1, value2, "batchtime");
            return (Criteria) this;
        }

        public Criteria andGuestidIsNull() {
            addCriterion("guestId is null");
            return (Criteria) this;
        }

        public Criteria andGuestidIsNotNull() {
            addCriterion("guestId is not null");
            return (Criteria) this;
        }

        public Criteria andGuestidEqualTo(Long value) {
            addCriterion("guestId =", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotEqualTo(Long value) {
            addCriterion("guestId <>", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidGreaterThan(Long value) {
            addCriterion("guestId >", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidGreaterThanOrEqualTo(Long value) {
            addCriterion("guestId >=", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidLessThan(Long value) {
            addCriterion("guestId <", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidLessThanOrEqualTo(Long value) {
            addCriterion("guestId <=", value, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidIn(List<Long> values) {
            addCriterion("guestId in", values, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotIn(List<Long> values) {
            addCriterion("guestId not in", values, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidBetween(Long value1, Long value2) {
            addCriterion("guestId between", value1, value2, "guestid");
            return (Criteria) this;
        }

        public Criteria andGuestidNotBetween(Long value1, Long value2) {
            addCriterion("guestId not between", value1, value2, "guestid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidIsNull() {
            addCriterion("franchiseeAreaOrgId is null");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidIsNotNull() {
            addCriterion("franchiseeAreaOrgId is not null");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidEqualTo(Integer value) {
            addCriterion("franchiseeAreaOrgId =", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidNotEqualTo(Integer value) {
            addCriterion("franchiseeAreaOrgId <>", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidGreaterThan(Integer value) {
            addCriterion("franchiseeAreaOrgId >", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("franchiseeAreaOrgId >=", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidLessThan(Integer value) {
            addCriterion("franchiseeAreaOrgId <", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidLessThanOrEqualTo(Integer value) {
            addCriterion("franchiseeAreaOrgId <=", value, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidIn(List<Integer> values) {
            addCriterion("franchiseeAreaOrgId in", values, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidNotIn(List<Integer> values) {
            addCriterion("franchiseeAreaOrgId not in", values, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidBetween(Integer value1, Integer value2) {
            addCriterion("franchiseeAreaOrgId between", value1, value2, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andFranchiseeareaorgidNotBetween(Integer value1, Integer value2) {
            addCriterion("franchiseeAreaOrgId not between", value1, value2, "franchiseeareaorgid");
            return (Criteria) this;
        }

        public Criteria andIslivephotoIsNull() {
            addCriterion("isLivePhoto is null");
            return (Criteria) this;
        }

        public Criteria andIslivephotoIsNotNull() {
            addCriterion("isLivePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andIslivephotoEqualTo(Byte value) {
            addCriterion("isLivePhoto =", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoNotEqualTo(Byte value) {
            addCriterion("isLivePhoto <>", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoGreaterThan(Byte value) {
            addCriterion("isLivePhoto >", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoGreaterThanOrEqualTo(Byte value) {
            addCriterion("isLivePhoto >=", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoLessThan(Byte value) {
            addCriterion("isLivePhoto <", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoLessThanOrEqualTo(Byte value) {
            addCriterion("isLivePhoto <=", value, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoIn(List<Byte> values) {
            addCriterion("isLivePhoto in", values, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoNotIn(List<Byte> values) {
            addCriterion("isLivePhoto not in", values, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoBetween(Byte value1, Byte value2) {
            addCriterion("isLivePhoto between", value1, value2, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivephotoNotBetween(Byte value1, Byte value2) {
            addCriterion("isLivePhoto not between", value1, value2, "islivephoto");
            return (Criteria) this;
        }

        public Criteria andIslivevideoIsNull() {
            addCriterion("isLiveVideo is null");
            return (Criteria) this;
        }

        public Criteria andIslivevideoIsNotNull() {
            addCriterion("isLiveVideo is not null");
            return (Criteria) this;
        }

        public Criteria andIslivevideoEqualTo(Byte value) {
            addCriterion("isLiveVideo =", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoNotEqualTo(Byte value) {
            addCriterion("isLiveVideo <>", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoGreaterThan(Byte value) {
            addCriterion("isLiveVideo >", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoGreaterThanOrEqualTo(Byte value) {
            addCriterion("isLiveVideo >=", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoLessThan(Byte value) {
            addCriterion("isLiveVideo <", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoLessThanOrEqualTo(Byte value) {
            addCriterion("isLiveVideo <=", value, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoIn(List<Byte> values) {
            addCriterion("isLiveVideo in", values, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoNotIn(List<Byte> values) {
            addCriterion("isLiveVideo not in", values, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoBetween(Byte value1, Byte value2) {
            addCriterion("isLiveVideo between", value1, value2, "islivevideo");
            return (Criteria) this;
        }

        public Criteria andIslivevideoNotBetween(Byte value1, Byte value2) {
            addCriterion("isLiveVideo not between", value1, value2, "islivevideo");
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