package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Exam;
import com.vanilla.healthmanagement.pojo.ExamExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ExamMapper {

    long countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByExample(ExamExample example);

    Exam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);

    /*统计高压*/
    @Select("select exam_highbp_temp,count(*) as count from (\n" +
            "select exam_highbp,case when exam_highbp between 1 and 90 then '1-90'\n" +
            "when exam_highbp between 90 and 140 then '90-140'\n" +
            "when exam_highbp between 140 and 180 then '140-180'\n" +
            "when exam_highbp >180 then '180+'\n" +
            "end as exam_highbp_temp from exam where active=1)exam group by exam_highbp_temp;")
    List<Map<String,String>> Sum_examHighbp();
    /*统计低压*/
    @Select("select exam_lowbp_temp,count(*) as count from (\n" +
            "select exam_lowbp,case when exam_lowbp between 1 and 60 then '1'\n" +
            "when exam_lowbp between 60 and 90 then '2'\n" +
            "when exam_lowbp between 90 and 110 then '3'\n" +
            "when exam_lowbp >110 then '4'\n" +
            "end as exam_lowbp_temp from exam where active=1  )exam group by exam_lowbp_temp;")
    List<Map<String,String>> Sum_examLowbp();
}