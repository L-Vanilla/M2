package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Visits;
import com.vanilla.healthmanagement.pojo.VisitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitsMapper {
    long countByExample(VisitsExample example);

    int deleteByExample(VisitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Visits record);

    int insertSelective(Visits record);

    List<Visits> selectByExample(VisitsExample example);

    Visits selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Visits record, @Param("example") VisitsExample example);

    int updateByExample(@Param("record") Visits record, @Param("example") VisitsExample example);

    int updateByPrimaryKeySelective(Visits record);

    int updateByPrimaryKey(Visits record);
}