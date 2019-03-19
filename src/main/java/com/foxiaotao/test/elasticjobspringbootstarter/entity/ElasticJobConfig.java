package com.foxiaotao.test.elasticjobspringbootstarter.entity;

public class ElasticJobConfig {
    private Integer id;

    private String jobName;

    private String cron;

    private Integer shardingTotalCount;

    private String shardingItemParameters;

    private String jobParameter;

    private String failover;

    private String misfire;

    private String description;

    private String jobClass;

    private String streamingProcess;

    private String jobConfig;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public Integer getShardingTotalCount() {
        return shardingTotalCount;
    }

    public void setShardingTotalCount(Integer shardingTotalCount) {
        this.shardingTotalCount = shardingTotalCount;
    }

    public String getShardingItemParameters() {
        return shardingItemParameters;
    }

    public void setShardingItemParameters(String shardingItemParameters) {
        this.shardingItemParameters = shardingItemParameters == null ? null : shardingItemParameters.trim();
    }

    public String getJobParameter() {
        return jobParameter;
    }

    public void setJobParameter(String jobParameter) {
        this.jobParameter = jobParameter == null ? null : jobParameter.trim();
    }

    public String getFailover() {
        return failover;
    }

    public void setFailover(String failover) {
        this.failover = failover == null ? null : failover.trim();
    }

    public String getMisfire() {
        return misfire;
    }

    public void setMisfire(String misfire) {
        this.misfire = misfire == null ? null : misfire.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass == null ? null : jobClass.trim();
    }

    public String getStreamingProcess() {
        return streamingProcess;
    }

    public void setStreamingProcess(String streamingProcess) {
        this.streamingProcess = streamingProcess == null ? null : streamingProcess.trim();
    }

    public String getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(String jobConfig) {
        this.jobConfig = jobConfig == null ? null : jobConfig.trim();
    }
}