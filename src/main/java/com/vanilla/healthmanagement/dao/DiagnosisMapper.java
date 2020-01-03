package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Diagnosis;
import com.vanilla.healthmanagement.pojo.DiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnosisMapper {
    long countByExample(DiagnosisExample example);

    int deleteByExample(DiagnosisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diagnosis record);

    int insertSelective(Diagnosis record);

    List<Diagnosis> selectByExample(DiagnosisExample example);

    Diagnosis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByExample(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByPrimaryKeySelective(Diagnosis record);

    int updateByPrimaryKey(Diagnosis record);
}