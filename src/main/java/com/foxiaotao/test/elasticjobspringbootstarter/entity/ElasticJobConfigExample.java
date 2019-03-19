package com.foxiaotao.test.elasticjobspringbootstarter.entity;

import java.util.ArrayList;
import java.util.List;

public class ElasticJobConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ElasticJobConfigExample() {
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

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountIsNull() {
            addCriterion("sharding_total_count is null");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountIsNotNull() {
            addCriterion("sharding_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountEqualTo(Integer value) {
            addCriterion("sharding_total_count =", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountNotEqualTo(Integer value) {
            addCriterion("sharding_total_count <>", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountGreaterThan(Integer value) {
            addCriterion("sharding_total_count >", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sharding_total_count >=", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountLessThan(Integer value) {
            addCriterion("sharding_total_count <", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("sharding_total_count <=", value, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountIn(List<Integer> values) {
            addCriterion("sharding_total_count in", values, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountNotIn(List<Integer> values) {
            addCriterion("sharding_total_count not in", values, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("sharding_total_count between", value1, value2, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sharding_total_count not between", value1, value2, "shardingTotalCount");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersIsNull() {
            addCriterion("sharding_item_parameters is null");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersIsNotNull() {
            addCriterion("sharding_item_parameters is not null");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersEqualTo(String value) {
            addCriterion("sharding_item_parameters =", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersNotEqualTo(String value) {
            addCriterion("sharding_item_parameters <>", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersGreaterThan(String value) {
            addCriterion("sharding_item_parameters >", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersGreaterThanOrEqualTo(String value) {
            addCriterion("sharding_item_parameters >=", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersLessThan(String value) {
            addCriterion("sharding_item_parameters <", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersLessThanOrEqualTo(String value) {
            addCriterion("sharding_item_parameters <=", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersLike(String value) {
            addCriterion("sharding_item_parameters like", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersNotLike(String value) {
            addCriterion("sharding_item_parameters not like", value, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersIn(List<String> values) {
            addCriterion("sharding_item_parameters in", values, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersNotIn(List<String> values) {
            addCriterion("sharding_item_parameters not in", values, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersBetween(String value1, String value2) {
            addCriterion("sharding_item_parameters between", value1, value2, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andShardingItemParametersNotBetween(String value1, String value2) {
            addCriterion("sharding_item_parameters not between", value1, value2, "shardingItemParameters");
            return (Criteria) this;
        }

        public Criteria andJobParameterIsNull() {
            addCriterion("job_parameter is null");
            return (Criteria) this;
        }

        public Criteria andJobParameterIsNotNull() {
            addCriterion("job_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andJobParameterEqualTo(String value) {
            addCriterion("job_parameter =", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterNotEqualTo(String value) {
            addCriterion("job_parameter <>", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterGreaterThan(String value) {
            addCriterion("job_parameter >", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterGreaterThanOrEqualTo(String value) {
            addCriterion("job_parameter >=", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterLessThan(String value) {
            addCriterion("job_parameter <", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterLessThanOrEqualTo(String value) {
            addCriterion("job_parameter <=", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterLike(String value) {
            addCriterion("job_parameter like", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterNotLike(String value) {
            addCriterion("job_parameter not like", value, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterIn(List<String> values) {
            addCriterion("job_parameter in", values, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterNotIn(List<String> values) {
            addCriterion("job_parameter not in", values, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterBetween(String value1, String value2) {
            addCriterion("job_parameter between", value1, value2, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andJobParameterNotBetween(String value1, String value2) {
            addCriterion("job_parameter not between", value1, value2, "jobParameter");
            return (Criteria) this;
        }

        public Criteria andFailoverIsNull() {
            addCriterion("failover is null");
            return (Criteria) this;
        }

        public Criteria andFailoverIsNotNull() {
            addCriterion("failover is not null");
            return (Criteria) this;
        }

        public Criteria andFailoverEqualTo(String value) {
            addCriterion("failover =", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotEqualTo(String value) {
            addCriterion("failover <>", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverGreaterThan(String value) {
            addCriterion("failover >", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverGreaterThanOrEqualTo(String value) {
            addCriterion("failover >=", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverLessThan(String value) {
            addCriterion("failover <", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverLessThanOrEqualTo(String value) {
            addCriterion("failover <=", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverLike(String value) {
            addCriterion("failover like", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotLike(String value) {
            addCriterion("failover not like", value, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverIn(List<String> values) {
            addCriterion("failover in", values, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotIn(List<String> values) {
            addCriterion("failover not in", values, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverBetween(String value1, String value2) {
            addCriterion("failover between", value1, value2, "failover");
            return (Criteria) this;
        }

        public Criteria andFailoverNotBetween(String value1, String value2) {
            addCriterion("failover not between", value1, value2, "failover");
            return (Criteria) this;
        }

        public Criteria andMisfireIsNull() {
            addCriterion("misfire is null");
            return (Criteria) this;
        }

        public Criteria andMisfireIsNotNull() {
            addCriterion("misfire is not null");
            return (Criteria) this;
        }

        public Criteria andMisfireEqualTo(String value) {
            addCriterion("misfire =", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireNotEqualTo(String value) {
            addCriterion("misfire <>", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireGreaterThan(String value) {
            addCriterion("misfire >", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireGreaterThanOrEqualTo(String value) {
            addCriterion("misfire >=", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireLessThan(String value) {
            addCriterion("misfire <", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireLessThanOrEqualTo(String value) {
            addCriterion("misfire <=", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireLike(String value) {
            addCriterion("misfire like", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireNotLike(String value) {
            addCriterion("misfire not like", value, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireIn(List<String> values) {
            addCriterion("misfire in", values, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireNotIn(List<String> values) {
            addCriterion("misfire not in", values, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireBetween(String value1, String value2) {
            addCriterion("misfire between", value1, value2, "misfire");
            return (Criteria) this;
        }

        public Criteria andMisfireNotBetween(String value1, String value2) {
            addCriterion("misfire not between", value1, value2, "misfire");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andJobClassIsNull() {
            addCriterion("job_class is null");
            return (Criteria) this;
        }

        public Criteria andJobClassIsNotNull() {
            addCriterion("job_class is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassEqualTo(String value) {
            addCriterion("job_class =", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotEqualTo(String value) {
            addCriterion("job_class <>", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThan(String value) {
            addCriterion("job_class >", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassGreaterThanOrEqualTo(String value) {
            addCriterion("job_class >=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThan(String value) {
            addCriterion("job_class <", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLessThanOrEqualTo(String value) {
            addCriterion("job_class <=", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassLike(String value) {
            addCriterion("job_class like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotLike(String value) {
            addCriterion("job_class not like", value, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassIn(List<String> values) {
            addCriterion("job_class in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotIn(List<String> values) {
            addCriterion("job_class not in", values, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassBetween(String value1, String value2) {
            addCriterion("job_class between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andJobClassNotBetween(String value1, String value2) {
            addCriterion("job_class not between", value1, value2, "jobClass");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessIsNull() {
            addCriterion("streaming_process is null");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessIsNotNull() {
            addCriterion("streaming_process is not null");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessEqualTo(String value) {
            addCriterion("streaming_process =", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessNotEqualTo(String value) {
            addCriterion("streaming_process <>", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessGreaterThan(String value) {
            addCriterion("streaming_process >", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessGreaterThanOrEqualTo(String value) {
            addCriterion("streaming_process >=", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessLessThan(String value) {
            addCriterion("streaming_process <", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessLessThanOrEqualTo(String value) {
            addCriterion("streaming_process <=", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessLike(String value) {
            addCriterion("streaming_process like", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessNotLike(String value) {
            addCriterion("streaming_process not like", value, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessIn(List<String> values) {
            addCriterion("streaming_process in", values, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessNotIn(List<String> values) {
            addCriterion("streaming_process not in", values, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessBetween(String value1, String value2) {
            addCriterion("streaming_process between", value1, value2, "streamingProcess");
            return (Criteria) this;
        }

        public Criteria andStreamingProcessNotBetween(String value1, String value2) {
            addCriterion("streaming_process not between", value1, value2, "streamingProcess");
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