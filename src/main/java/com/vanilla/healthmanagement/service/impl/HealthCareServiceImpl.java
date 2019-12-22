package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.HealthCareMapper;
import com.vanilla.healthmanagement.pojo.HealthCare;
import com.vanilla.healthmanagement.pojo.HealthCareExample;
import com.vanilla.healthmanagement.service.HealthCareService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*养生保健
 * 12-21Vanilla
 * */
@Service
@Primary
public class HealthCareServiceImpl implements HealthCareService {
    @Resource
    HealthCareMapper HealthCareMapper;
    @Override
    public List<HealthCare> getHealthCares(HealthCare healthCare) {

        PageHelper.startPage(healthCare.getPageNo(), healthCare.getPageSize());
        HealthCareExample HealthCareExample = new HealthCareExample();
        HealthCareExample.Criteria criteria = HealthCareExample.createCriteria();
        if (StringUtils.isNotBlank(healthCare.getTitle())) {
            criteria.andTitleLike("%" + healthCare.getTitle() + "%").andActiveEqualTo(1);
        }
        if (StringUtils.isNotBlank(healthCare.gethType())) {
            criteria.andHTypeLike("%" + healthCare.gethType() + "%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }
        HealthCareExample.setOrderByClause("id desc");
//        if(HealthCare.getActive()!=null)
//            criteria.andActiveEqualTo(HealthCare.getActive());

        return HealthCareMapper.selectByExample(HealthCareExample);
    }

    @Override
    public List<HealthCare> getAll(HealthCare healthCare) {
        HealthCareExample healthCareExample = new HealthCareExample();
        healthCareExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return HealthCareMapper.selectByExample(healthCareExample);
    }

    @Override
    public HealthCare getHealthCareById(int id) {
        return HealthCareMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(HealthCare healthCare) {
        healthCare.setCreateDate(new Date());
        return HealthCareMapper.insertSelective(healthCare);
    }

    @Override
    public int del(HealthCare healthCare) {
        return HealthCareMapper.updateByPrimaryKeySelective(healthCare);
    }

    @Override
    public int update(HealthCare healthCare) {
        return HealthCareMapper.updateByPrimaryKeySelective(healthCare);
    }

}
