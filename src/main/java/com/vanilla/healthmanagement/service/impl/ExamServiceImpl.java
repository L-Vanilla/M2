package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.ExamMapper;
import com.vanilla.healthmanagement.pojo.Exam;
import com.vanilla.healthmanagement.pojo.ExamExample;
import com.vanilla.healthmanagement.service.ExamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*体检信息管理
 * 20-1-3Vanilla
 * */

@Service
@Primary
public class ExamServiceImpl implements ExamService {
    @Resource
    ExamMapper ExamMapper;
    @Override
    public List<Exam> getExams(Exam exam) {

        PageHelper.startPage(exam.getPageNo(), exam.getPageSize());
        ExamExample ExamExample = new ExamExample();
        ExamExample.Criteria criteria = ExamExample.createCriteria();
        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(exam.getOlderName())) {
            criteria.andOlderNameLike("%" + exam.getOlderName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        ExamExample.setOrderByClause("id desc");
        return ExamMapper.selectByExample(ExamExample);
    }

    @Override
    public List<Exam> getAll(Exam exam) {
        ExamExample examExample = new ExamExample();
        examExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return ExamMapper.selectByExample(examExample);
    }

    @Override
    public Exam getExamById(int id) {
        return ExamMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Exam exam) {
        exam.setCreateDate(new Date());
        return ExamMapper.insertSelective(exam);
    }

    @Override
    public int del(Exam exam) {
        return ExamMapper.updateByPrimaryKeySelective(exam);
    }

    @Override
    public int update(Exam exam) {
        return ExamMapper.updateByPrimaryKeySelective(exam);
    }


}
