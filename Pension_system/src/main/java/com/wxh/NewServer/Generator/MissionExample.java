package com.wxh.NewServer.Generator;

import java.util.ArrayList;
import java.util.List;

public class MissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MissionExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(String value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(String value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(String value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(String value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(String value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLike(String value) {
            addCriterion("mission_id like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotLike(String value) {
            addCriterion("mission_id not like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<String> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<String> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(String value1, String value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(String value1, String value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIsNull() {
            addCriterion("mission_applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIsNotNull() {
            addCriterion("mission_applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdEqualTo(String value) {
            addCriterion("mission_applicant_id =", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotEqualTo(String value) {
            addCriterion("mission_applicant_id <>", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdGreaterThan(String value) {
            addCriterion("mission_applicant_id >", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_applicant_id >=", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLessThan(String value) {
            addCriterion("mission_applicant_id <", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLessThanOrEqualTo(String value) {
            addCriterion("mission_applicant_id <=", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdLike(String value) {
            addCriterion("mission_applicant_id like", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotLike(String value) {
            addCriterion("mission_applicant_id not like", value, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdIn(List<String> values) {
            addCriterion("mission_applicant_id in", values, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotIn(List<String> values) {
            addCriterion("mission_applicant_id not in", values, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdBetween(String value1, String value2) {
            addCriterion("mission_applicant_id between", value1, value2, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionApplicantIdNotBetween(String value1, String value2) {
            addCriterion("mission_applicant_id not between", value1, value2, "missionApplicantId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIsNull() {
            addCriterion("mission_volunteer_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIsNotNull() {
            addCriterion("mission_volunteer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdEqualTo(String value) {
            addCriterion("mission_volunteer_id =", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotEqualTo(String value) {
            addCriterion("mission_volunteer_id <>", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdGreaterThan(String value) {
            addCriterion("mission_volunteer_id >", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_volunteer_id >=", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLessThan(String value) {
            addCriterion("mission_volunteer_id <", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLessThanOrEqualTo(String value) {
            addCriterion("mission_volunteer_id <=", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdLike(String value) {
            addCriterion("mission_volunteer_id like", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotLike(String value) {
            addCriterion("mission_volunteer_id not like", value, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdIn(List<String> values) {
            addCriterion("mission_volunteer_id in", values, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotIn(List<String> values) {
            addCriterion("mission_volunteer_id not in", values, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdBetween(String value1, String value2) {
            addCriterion("mission_volunteer_id between", value1, value2, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionVolunteerIdNotBetween(String value1, String value2) {
            addCriterion("mission_volunteer_id not between", value1, value2, "missionVolunteerId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIsNull() {
            addCriterion("mission_event_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIsNotNull() {
            addCriterion("mission_event_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdEqualTo(String value) {
            addCriterion("mission_event_id =", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotEqualTo(String value) {
            addCriterion("mission_event_id <>", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdGreaterThan(String value) {
            addCriterion("mission_event_id >", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_event_id >=", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLessThan(String value) {
            addCriterion("mission_event_id <", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLessThanOrEqualTo(String value) {
            addCriterion("mission_event_id <=", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdLike(String value) {
            addCriterion("mission_event_id like", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotLike(String value) {
            addCriterion("mission_event_id not like", value, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdIn(List<String> values) {
            addCriterion("mission_event_id in", values, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotIn(List<String> values) {
            addCriterion("mission_event_id not in", values, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdBetween(String value1, String value2) {
            addCriterion("mission_event_id between", value1, value2, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionEventIdNotBetween(String value1, String value2) {
            addCriterion("mission_event_id not between", value1, value2, "missionEventId");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIsNull() {
            addCriterion("mission_status is null");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIsNotNull() {
            addCriterion("mission_status is not null");
            return (Criteria) this;
        }

        public Criteria andMissionStatusEqualTo(String value) {
            addCriterion("mission_status =", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotEqualTo(String value) {
            addCriterion("mission_status <>", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusGreaterThan(String value) {
            addCriterion("mission_status >", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mission_status >=", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLessThan(String value) {
            addCriterion("mission_status <", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLessThanOrEqualTo(String value) {
            addCriterion("mission_status <=", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusLike(String value) {
            addCriterion("mission_status like", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotLike(String value) {
            addCriterion("mission_status not like", value, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusIn(List<String> values) {
            addCriterion("mission_status in", values, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotIn(List<String> values) {
            addCriterion("mission_status not in", values, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusBetween(String value1, String value2) {
            addCriterion("mission_status between", value1, value2, "missionStatus");
            return (Criteria) this;
        }

        public Criteria andMissionStatusNotBetween(String value1, String value2) {
            addCriterion("mission_status not between", value1, value2, "missionStatus");
            return (Criteria) this;
        }
    }

    /**
     */
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