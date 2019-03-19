package com.foxiaotao.test.elasticjobspringbootstarter.dao;

import com.foxiaotao.test.elasticjobspringbootstarter.entity.ElasticJobConfig;
import com.foxiaotao.test.elasticjobspringbootstarter.entity.ElasticJobConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElasticJobConfigMapper {
    int countByExample(ElasticJobConfigExample example);

    int deleteByExample(ElasticJobConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElasticJobConfig record);

    int insertSelective(ElasticJobConfig record);

    List<ElasticJobConfig> selectByExampleWithBLOBs(ElasticJobConfigExample example);

    List<ElasticJobConfig> selectByExample(ElasticJobConfigExample example);

    ElasticJobConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElasticJobConfig record, @Param("example") ElasticJobConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") ElasticJobConfig record, @Param("example") ElasticJobConfigExample example);

    int updateByExample(@Param("record") ElasticJobConfig record, @Param("example") ElasticJobConfigExample example);

    int updateByPrimaryKeySelective(ElasticJobConfig record);

    int updateByPrimaryKeyWithBLOBs(ElasticJobConfig record);

    int updateByPrimaryKey(ElasticJobConfig record);
}