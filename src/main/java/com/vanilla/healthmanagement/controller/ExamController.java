package com.vanilla.healthmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Exam;
import com.vanilla.healthmanagement.pojo.Older;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*体检信息管理
* 19-1-3Vanilla
* */

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Resource
    com.vanilla.healthmanagement.service.ExamService ExamService;
    @Resource
    com.vanilla.healthmanagement.service.OlderService OlderService;
    @GetMapping("/list")
    public PageInfo<Exam> getExam(Exam exam){
        List<Exam> exams =ExamService.getExams(exam);
        PageInfo<Exam> pageInfo = new PageInfo<>(exams);
        System.out.println("examlist:"+pageInfo);
        return pageInfo;
    }
    /*根据老人id查询体检信息*/
    @GetMapping("/getListByOlderId")
    public PageInfo<Exam> getListByOlderId(Exam exam){
        List<Exam> exams =ExamService.getExamsByOrderId(exam);
        PageInfo<Exam> pageInfo = new PageInfo<>(exams);
        System.out.println("examlist:"+pageInfo);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Exam> getAll(Exam exam){
//        Exam.setActive(1);
        return ExamService.getAll(exam);
    }
    @PostMapping("/add")
    public int add(Exam exam){
        Older older=new Older();
        older= OlderService.getOlderById(exam.getOlderId());
        Integer score=0;
        /*高压*/
        if(90<exam.getExamHighbp()&&exam.getExamHighbp()<140){
            score=score+5;
        }
        else if(140<=exam.getExamHighbp()&&exam.getExamHighbp()<=180){
            score=score-5;
        }
        else if(exam.getExamHighbp()>180){
            score=score-10;
        }
        /*低压*/
        if(60<exam.getExamLowbp()&&exam.getExamLowbp()<90){
            score=score+5;
        }
        else if(90<=exam.getExamLowbp()&&exam.getExamLowbp()<=110){
            score=score-5;
        }
        else if(exam.getExamLowbp()>110){
            score=score-10;
        }
        /*血糖*/
        if(exam.getExamGlu().compareTo(new BigDecimal(2.8))==1&&exam.getExamGlu().compareTo(new BigDecimal(7.8))==-1){
            score=score+5;
        }
        else if(exam.getExamGlu().compareTo(new BigDecimal(7.8))==1&&exam.getExamGlu().compareTo(new BigDecimal(11))==-1){
            score=score-5;
        }
        else if(exam.getExamGlu().compareTo(new BigDecimal(11))==1){
            score=score-10;
        }
        /*心率*/
        if(60<=exam.getExamHr()&&exam.getExamHr()<100){
            score=score+5;
        }
        else if(exam.getExamHr()>=100){
            score=score-10;
        }
        /*修改健康状态*/
        if(older.getOlderBmi()+score>1200){
            older.setOlderState(0);
        }
        else if (800<=older.getOlderBmi()+score&&older.getOlderBmi()+score<1200){
            older.setOlderState(1);
        }
        else if (600<=older.getOlderBmi()+score&&older.getOlderBmi()+score<800){
            older.setOlderState(2);
        }
        else if (older.getOlderBmi()+score<600){
            older.setOlderState(3);
        }
        older.setOlderBmi(older.getOlderBmi()+score);
        OlderService.update(older);
        return ExamService.add(exam);
    }
    @GetMapping("/del")
    public int del(Exam exam){
        return ExamService.update(exam);
    }

    @PostMapping("/update")
    public int update(@Valid Exam exam, BindingResult bindingResult){
        return ExamService.update(exam);
    }
    @GetMapping("/getOne")
    public Exam getOne(Integer id){
        return ExamService.getExamById(id);
    }

    @GetMapping("/SumExam")
    public String SumExam(){
        Map<String,List<?>> map = new HashMap<>();
        /*统计高压*/
        map.put("examHighbps",ExamService.Sum_examHighbp());
        /*统计低压*/
        map.put("examLowbps",ExamService.Sum_examLowbp());
//        /*统计老人的健康状态*/
//        map.put("healthStates",OlderService.Sum_OlderHealthState());

        return JSON.toJSONString(map);
    }
}
