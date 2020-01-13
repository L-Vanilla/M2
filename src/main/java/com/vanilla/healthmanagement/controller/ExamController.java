package com.vanilla.healthmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Exam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
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
