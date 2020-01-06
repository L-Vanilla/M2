package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.DiagnosisMapper;
import com.vanilla.healthmanagement.pojo.Diagnosis;
import com.vanilla.healthmanagement.pojo.DiagnosisExample;
import com.vanilla.healthmanagement.service.DiagnosisService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*诊断信息管理
 * 20-1-3Vanilla
 * */

@Service
@Primary
public class DiagnosisServiceImpl implements DiagnosisService {
    @Resource
    DiagnosisMapper DiagnosisMapper;
    @Override
    public List<Diagnosis> getDiagnosiss(Diagnosis diagnosis) {

        PageHelper.startPage(diagnosis.getPageNo(), diagnosis.getPageSize());
        DiagnosisExample DiagnosisExample = new DiagnosisExample();
        DiagnosisExample.Criteria criteria = DiagnosisExample.createCriteria();
        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(diagnosis.getOlderName())) {
            criteria.andOlderNameLike("%" + diagnosis.getOlderName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        DiagnosisExample.setOrderByClause("id desc");
//        if(Diagnosis.getActive()!=null)
//            criteria.andActiveEqualTo(Diagnosis.getActive());

        return DiagnosisMapper.selectByExample(DiagnosisExample);
    }

    @Override
    public List<Diagnosis> getAll(Diagnosis diagnosis) {
        DiagnosisExample DiagnosisExample = new DiagnosisExample();
        DiagnosisExample.Criteria criteria = DiagnosisExample.createCriteria();
        /*根据老人姓名进行模糊查询*/
        if (diagnosis.getOlderId()!=null) {
            criteria.andOlderIdEqualTo(diagnosis.getOlderId()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        return DiagnosisMapper.selectByExample(DiagnosisExample);
    }

    @Override
    public Diagnosis getDiagnosisById(int id) {
        return DiagnosisMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Diagnosis diagnosis) {
        diagnosis.setCreateDate(new Date());
        return DiagnosisMapper.insertSelective(diagnosis);
    }

    @Override
    public int del(Diagnosis diagnosis) {
        return DiagnosisMapper.updateByPrimaryKeySelective(diagnosis);
    }

    @Override
    public int update(Diagnosis diagnosis) {
        return DiagnosisMapper.updateByPrimaryKeySelective(diagnosis);
    }


}
