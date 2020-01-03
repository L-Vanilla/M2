package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.AidMapper;
import com.vanilla.healthmanagement.pojo.Aid;
import com.vanilla.healthmanagement.pojo.AidExample;
import com.vanilla.healthmanagement.service.AidService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*急救信息管理
 * 20-1-3Vanilla
 * */

@Service
@Primary
public class AidServiceImpl implements AidService {
    @Resource
    AidMapper AidMapper;
    @Override
    public List<Aid> getAids(Aid aid) {

        PageHelper.startPage(aid.getPageNo(), aid.getPageSize());
        AidExample AidExample = new AidExample();
        AidExample.Criteria criteria = AidExample.createCriteria();
        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(aid.getOlderName())) {
            criteria.andOlderNameLike("%" + aid.getOlderName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        AidExample.setOrderByClause("id desc");
        return AidMapper.selectByExample(AidExample);
    }

    @Override
    public List<Aid> getAll(Aid aid) {
        AidExample aidExample = new AidExample();
        aidExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return AidMapper.selectByExample(aidExample);
    }

    @Override
    public Aid getAidById(int id) {
        return AidMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Aid aid) {
        aid.setCreateDate(new Date());
        return AidMapper.insertSelective(aid);
    }

    @Override
    public int del(Aid aid) {
        return AidMapper.updateByPrimaryKeySelective(aid);
    }

    @Override
    public int update(Aid aid) {
        return AidMapper.updateByPrimaryKeySelective(aid);
    }


}
