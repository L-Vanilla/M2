package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.HealthCare;
import com.vanilla.healthmanagement.pojo.HealthCareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthCareMapper {
    long countByExample(HealthCareExample example);

    int deleteByExample(HealthCareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HealthCare record);

    int insertSelective(HealthCare record);

    List<HealthCare> selectByExampleWithBLOBs(HealthCareExample example);

    List<HealthCare> selectByExample(HealthCareExample example);

    HealthCare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HealthCare record, @Param("example") HealthCareExample example);

    int updateByExampleWithBLOBs(@Param("record") HealthCare record, @Param("example") HealthCareExample example);

    int updateByExample(@Param("record") HealthCare record, @Param("example") HealthCareExample example);

    int updateByPrimaryKeySelective(HealthCare record);

    int updateByPrimaryKeyWithBLOBs(HealthCare record);

    int updateByPrimaryKey(HealthCare record);
}