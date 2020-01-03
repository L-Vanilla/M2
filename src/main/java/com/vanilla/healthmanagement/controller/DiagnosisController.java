package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Diagnosis;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/*诊断信息管理
* 19-1-3Vanilla
* */

@RestController
@RequestMapping("/diagnosis")
public class DiagnosisController {
    @Resource
    com.vanilla.healthmanagement.service.DiagnosisService DiagnosisService;
    @GetMapping("/list")
    public PageInfo<Diagnosis> getDiagnosis(Diagnosis diagnosis){
        List<Diagnosis> diagnosiss =DiagnosisService.getDiagnosiss(diagnosis);
        PageInfo<Diagnosis> pageInfo = new PageInfo<>(diagnosiss);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Diagnosis> getAll(Diagnosis diagnosis){
//        Diagnosis.setActive(1);
        return DiagnosisService.getAll(diagnosis);
    }
    @PostMapping("/add")
    public int add(Diagnosis diagnosis){
        return DiagnosisService.add(diagnosis);
    }
    @GetMapping("/del")
    public int del(Diagnosis diagnosis){
        return DiagnosisService.update(diagnosis);
    }

    @PostMapping("/update")
    public int update(@Valid Diagnosis diagnosis, BindingResult bindingResult){
        return DiagnosisService.update(diagnosis);
    }
    @GetMapping("/getOne")
    public Diagnosis getOne(Integer id){
        return DiagnosisService.getDiagnosisById(id);
    }

}
