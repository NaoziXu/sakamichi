package org.naozi.sakamichi.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SakamichiArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SakamichiArticleExample() {
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

        public Criteria andCoverMaterialIdsIsNull() {
            addCriterion("cover_material_ids is null");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsIsNotNull() {
            addCriterion("cover_material_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsEqualTo(String value) {
            addCriterion("cover_material_ids =", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsNotEqualTo(String value) {
            addCriterion("cover_material_ids <>", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsGreaterThan(String value) {
            addCriterion("cover_material_ids >", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsGreaterThanOrEqualTo(String value) {
            addCriterion("cover_material_ids >=", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsLessThan(String value) {
            addCriterion("cover_material_ids <", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsLessThanOrEqualTo(String value) {
            addCriterion("cover_material_ids <=", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsLike(String value) {
            addCriterion("cover_material_ids like", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsNotLike(String value) {
            addCriterion("cover_material_ids not like", value, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsIn(List<String> values) {
            addCriterion("cover_material_ids in", values, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsNotIn(List<String> values) {
            addCriterion("cover_material_ids not in", values, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsBetween(String value1, String value2) {
            addCriterion("cover_material_ids between", value1, value2, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andCoverMaterialIdsNotBetween(String value1, String value2) {
            addCriterion("cover_material_ids not between", value1, value2, "coverMaterialIds");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdIsNull() {
            addCriterion("content_material_id is null");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdIsNotNull() {
            addCriterion("content_material_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdEqualTo(Long value) {
            addCriterion("content_material_id =", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdNotEqualTo(Long value) {
            addCriterion("content_material_id <>", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdGreaterThan(Long value) {
            addCriterion("content_material_id >", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_material_id >=", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdLessThan(Long value) {
            addCriterion("content_material_id <", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdLessThanOrEqualTo(Long value) {
            addCriterion("content_material_id <=", value, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdIn(List<Long> values) {
            addCriterion("content_material_id in", values, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdNotIn(List<Long> values) {
            addCriterion("content_material_id not in", values, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdBetween(Long value1, Long value2) {
            addCriterion("content_material_id between", value1, value2, "contentMaterialId");
            return (Criteria) this;
        }

        public Criteria andContentMaterialIdNotBetween(Long value1, Long value2) {
            addCriterion("content_material_id not between", value1, value2, "contentMaterialId");
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

        public Criteria andTagIdsIsNull() {
            addCriterion("tag_ids is null");
            return (Criteria) this;
        }

        public Criteria andTagIdsIsNotNull() {
            addCriterion("tag_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdsEqualTo(Long value) {
            addCriterion("tag_ids =", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotEqualTo(Long value) {
            addCriterion("tag_ids <>", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsGreaterThan(Long value) {
            addCriterion("tag_ids >", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsGreaterThanOrEqualTo(Long value) {
            addCriterion("tag_ids >=", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsLessThan(Long value) {
            addCriterion("tag_ids <", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsLessThanOrEqualTo(Long value) {
            addCriterion("tag_ids <=", value, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsIn(List<Long> values) {
            addCriterion("tag_ids in", values, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotIn(List<Long> values) {
            addCriterion("tag_ids not in", values, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsBetween(Long value1, Long value2) {
            addCriterion("tag_ids between", value1, value2, "tagIds");
            return (Criteria) this;
        }

        public Criteria andTagIdsNotBetween(Long value1, Long value2) {
            addCriterion("tag_ids not between", value1, value2, "tagIds");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("is_available is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("is_available is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(Boolean value) {
            addCriterion("is_available =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(Boolean value) {
            addCriterion("is_available <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(Boolean value) {
            addCriterion("is_available >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_available >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(Boolean value) {
            addCriterion("is_available <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_available <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<Boolean> values) {
            addCriterion("is_available in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<Boolean> values) {
            addCriterion("is_available not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_available between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_available not between", value1, value2, "isAvailable");
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