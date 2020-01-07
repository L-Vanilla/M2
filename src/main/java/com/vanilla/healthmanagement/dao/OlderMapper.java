package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Older;
import com.vanilla.healthmanagement.pojo.OlderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OlderMapper {
    long countByExample(OlderExample example);

    int deleteByExample(OlderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Older record);

    int insertSelective(Older record);

    List<Older> selectByExample(OlderExample example);

    Older selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Older record, @Param("example") OlderExample example);

    int updateByExample(@Param("record") Older record, @Param("example") OlderExample example);

    int updateByPrimaryKeySelective(Older record);

    int updateByPrimaryKey(Older record);

    /*20-1-2用户登录*/
    Older selectByNameAndPwd(@Param("olderName") String olderName, @Param("olderPassword") String olderPassword);

    /*统计老人性别*/
    @Select("SELECT older_sex,count(*) as count FROM older where active=1 group by older_sex ")
    List<Map<String,String>> Sum_OlderSex();
    /*统计老人健康状态*/
    @Select("SELECT older_state,count(*) as count FROM older where active=1 group by older_state ")
    List<Map<String,String>> Sum_OlderHealthState();
    /*统计老人年龄分布*/
    @Select("select age_temp,count(*) as count from (\n" +
            "select older_age,case when older_age between 1 and 50 then '1-50'\n" +
            "when older_age between 50 and 60 then '50-60'\n" +
            "when older_age between 60 and 70 then '60-70'\n" +
            "when older_age between 70 and 80 then '70-80'\n" +
            "when older_age >80 then '80+'\n" +
            "end as age_temp from older where active=1)older group by age_temp;")
    List<Map<String,String>> Sum_OlderAge();
}
