package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Aid;
import com.vanilla.healthmanagement.pojo.AidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidMapper {
    long countByExample(AidExample example);

    int deleteByExample(AidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aid record);

    int insertSelective(Aid record);

    List<Aid> selectByExample(AidExample example);

    Aid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aid record, @Param("example") AidExample example);

    int updateByExample(@Param("record") Aid record, @Param("example") AidExample example);

    int updateByPrimaryKeySelective(Aid record);

    int updateByPrimaryKey(Aid record);
}