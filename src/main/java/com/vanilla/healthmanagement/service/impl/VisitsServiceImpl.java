package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.VisitsMapper;
import com.vanilla.healthmanagement.pojo.Visits;
import com.vanilla.healthmanagement.pojo.VisitsExample;
import com.vanilla.healthmanagement.service.VisitsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*随访信息管理
 * 20-1-3Vanilla
 * */

@Service
@Primary
public class VisitsServiceImpl implements VisitsService {
    @Resource
    VisitsMapper VisitsMapper;
    @Override
    public List<Visits> getVisitss(Visits visits) {

        PageHelper.startPage(visits.getPageNo(), visits.getPageSize());
        VisitsExample VisitsExample = new VisitsExample();
        VisitsExample.Criteria criteria = VisitsExample.createCriteria();
        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(visits.getOlderName())) {
            criteria.andOlderNameLike("%" + visits.getOlderName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        VisitsExample.setOrderByClause("id desc");
        return VisitsMapper.selectByExample(VisitsExample);
    }

    @Override
    public List<Visits> getAll(Visits visits) {
        VisitsExample visitsExample = new VisitsExample();
        visitsExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return VisitsMapper.selectByExample(visitsExample);
    }

    @Override
    public Visits getVisitsById(int id) {
        return VisitsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Visits visits) {
        visits.setCreateDate(new Date());
        return VisitsMapper.insertSelective(visits);
    }

    @Override
    public int del(Visits visits) {
        return VisitsMapper.updateByPrimaryKeySelective(visits);
    }

    @Override
    public int update(Visits visits) {
        return VisitsMapper.updateByPrimaryKeySelective(visits);
    }


}
