package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.OlderMapper;
import com.vanilla.healthmanagement.pojo.Older;
import com.vanilla.healthmanagement.pojo.OlderExample;
import com.vanilla.healthmanagement.service.OlderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*老人管理
 * 20-1-2Vanilla
 * */

@Service
@Primary
public class OlderServiceImpl implements OlderService {
    @Resource
    OlderMapper OlderMapper;
    @Override
    public List<Older> getOlders(Older older) {

        PageHelper.startPage(older.getPageNo(), older.getPageSize());
        OlderExample OlderExample = new OlderExample();
        OlderExample.Criteria criteria = OlderExample.createCriteria();
        if (StringUtils.isNotBlank(older.getOlderName())) {
            criteria.andOlderNameLike("%" + older.getOlderName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        OlderExample.setOrderByClause("id desc");
//        if(Older.getActive()!=null)
//            criteria.andActiveEqualTo(Older.getActive());

        return OlderMapper.selectByExample(OlderExample);
    }

    @Override
    public List<Older> getAll(Older older) {
        OlderExample OlderExample = new OlderExample();
        OlderExample.Criteria criteria = OlderExample.createCriteria();
        if (older.getId()!=null) {
            criteria.andIdEqualTo(older.getId()).andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(older.getOlderName())) {
            criteria.andOlderNameEqualTo(older.getOlderName()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return OlderMapper.selectByExample(OlderExample);
    }

    @Override
    public Older getOlderById(int id) {
        return OlderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Older older) {
        older.setCreateDate(new Date());
        return OlderMapper.insertSelective(older);
    }

    @Override
    public int del(Older older) {
        return OlderMapper.updateByPrimaryKeySelective(older);
    }

    @Override
    public int update(Older older) {
        return OlderMapper.updateByPrimaryKeySelective(older);
    }

    /*20-1-3用户登录*/
    public Older getByNameAndPwd(String olderName, String olderPassword) {
        return OlderMapper.selectByNameAndPwd(olderName,olderPassword);
    }
    /*统计老人性别*/
    @Override
    public List<Map<String,String>> Sum_OlderSex() {
        return OlderMapper.Sum_OlderSex();
    }
    /*统计老人健康状态*/
    @Override
    public List<Map<String,String>> Sum_OlderHealthState() {
        return OlderMapper.Sum_OlderHealthState();
    }
    /*统计老人年龄分布*/
    @Override
    public List<Map<String,String>> Sum_OlderAge() {
        return OlderMapper.Sum_OlderAge();
    }
}
