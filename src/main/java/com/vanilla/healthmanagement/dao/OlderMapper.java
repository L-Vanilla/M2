package com.vanilla.healthmanagement.dao;

import com.vanilla.healthmanagement.pojo.Older;
import com.vanilla.healthmanagement.pojo.OlderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}