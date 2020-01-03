package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Exam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

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

}
