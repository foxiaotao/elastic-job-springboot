INSERT INTO `elastic_job_config` (`job_name`, `cron`, `sharding_total_count`, `sharding_item_parameters`, `job_parameter`, `failover`, `misfire`, `description`, `job_class`, `streaming_process`, `job_config`)
VALUES
	('DemoSimpleJob', '* * * * * ?', 1, '', '', 'true', 'true', '测试定时任务', 'com.foxiaotao.test.elasticjobspringbootstarter.config.job.dbjob.DemoSimpleJob', 'true', ''),
	('DemoSimpleJob2', '*/2 * * * * ?', 1, '', '', 'true', 'true', '测试定时任务2', 'com.foxiaotao.test.elasticjobspringbootstarter.config.job.dbjob.DemoSimpleJob2', 'true', ''),
	('DemoSimpleJob3', '*/5 * * * * ?', 1, '', '', 'true', 'true', '测试定时任务3', 'com.foxiaotao.test.elasticjobspringbootstarter.config.job.dbjob.DemoSimpleJob3', 'true', '');