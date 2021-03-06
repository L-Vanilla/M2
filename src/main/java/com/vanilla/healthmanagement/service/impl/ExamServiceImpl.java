package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.vanilla.healthmanagement.dao.ExamMapper;
import com.vanilla.healthmanagement.pojo.Exam;
import com.vanilla.healthmanagement.pojo.ExamExample;
import com.vanilla.healthmanagement.service.ExamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

        //根据时间范围查询
        Date predate;
        Date latedate;
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));    //获取东八区时间

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String curDate = s.format(c.getTime());

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        String curDate2 = s2.format(c.getTime());//当前日期

        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(exam.getOlderName())) {
            criteria.andOlderNameLike("%" + exam.getOlderName() + "%").andActiveEqualTo(1);
        }
        /*根据老人id进行查询*/
        if (exam.getOlderId()!= null) {
            System.out.println("exam中老人id:"+exam.getOlderId());
            criteria.andOlderIdEqualTo(exam.getOlderId()).andActiveEqualTo(1);
        }
        /*根据时间模糊查询*/
        if(exam.getDate1()==null&&exam.getDate2()==null) {
            criteria.andActiveEqualTo(1);
        } else if (exam.getDate1()!=null&&exam.getDate2()==null) {
            predate = exam.getDate1();
            latedate = StringToDate(curDate2);
            criteria.andCreateDateBetween(predate, latedate).andActiveEqualTo(1);
        }else if(exam.getDate1()==null&&exam.getDate2()!=null){
            predate = StringToDate(curDate);
            latedate = exam.getDate2();
            criteria.andCreateDateBetween(predate, latedate).andActiveEqualTo(1);
        }
        else  {
            predate = exam.getDate1();
            latedate = exam.getDate2();
            criteria.andCreateDateBetween(predate, latedate).andActiveEqualTo(1);
        }
        /*按照id倒叙*/
        ExamExample.setOrderByClause("id desc");
        return ExamMapper.selectByExample(ExamExample);
    }

    /*根据老人id查询体检信息*/
    @Override
    public List<Exam> getExamsByOrderId(Exam exam) {

        PageHelper.startPage(exam.getPageNo(), exam.getPageSize());
        ExamExample ExamExample = new ExamExample();
        ExamExample.Criteria criteria = ExamExample.createCriteria();

        /*根据老人姓名进行模糊查询*/
        if (StringUtils.isNotBlank(exam.getOlderName())) {
            criteria.andOlderNameLike("%" + exam.getOlderName() + "%").andActiveEqualTo(1);
        }
        /*根据老人id进行查询*/
        if (exam.getOlderId()!= null) {
            System.out.println("exam中老人id:"+exam.getOlderId());
            criteria.andOlderIdEqualTo(exam.getOlderId()).andActiveEqualTo(1);
        }
        criteria.andActiveEqualTo(1);
        /*按照id倒叙*/
        ExamExample.setOrderByClause("id desc");
        return ExamMapper.selectByExample(ExamExample);
    }

    @Override
    public List<Exam> getAll(Exam exam) {
        ExamExample ExamExample = new ExamExample();
        ExamExample.Criteria criteria = ExamExample.createCriteria();
        /*根据老人id进行查询*/
        if (exam.getOlderId()!= null) {
            criteria.andOlderIdEqualTo(exam.getOlderId()).andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }
        return ExamMapper.selectByExample(ExamExample);
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

    //String转Date
    public Date StringToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            //sdf的格式要与dateString的格式相同，否者会报错
            e.printStackTrace();
        }
        return date;
    }

    /*统计高压*/
    @Override
    public List<Map<String,String>> Sum_examHighbp() {
        return ExamMapper.Sum_examHighbp();
    }
    /*统计低压*/
    @Override
    public List<Map<String,String>> Sum_examLowbp() {
        return ExamMapper.Sum_examLowbp();
    }

}
