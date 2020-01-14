package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Diagnosis;
import com.vanilla.healthmanagement.pojo.Older;
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
    @Resource
    com.vanilla.healthmanagement.service.OlderService OlderService;
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

    /*修改等级状态*/
    @GetMapping("/updateRank")
    public int updateRank(Diagnosis diagnosis){
        diagnosis.setCheckState(1);
        Older older=new Older();
        older= OlderService.getOlderById(diagnosis.getOlderId());
        /*等级*/
        if(diagnosis.getRank()==1){
            older.setOlderBmi(older.getOlderBmi()-5);
        }
        else if(diagnosis.getRank()==2){
            older.setOlderBmi(older.getOlderBmi()-10);
        }
        else if(diagnosis.getRank()==3){
            older.setOlderBmi(older.getOlderBmi()-15);
        }
        /*修改健康状态*/
        if(older.getOlderBmi()>1200){
            older.setOlderState(0);
        }
        else if (800<=older.getOlderBmi()&&older.getOlderBmi()<1200){
            older.setOlderState(1);
        }
        else if (600<=older.getOlderBmi()&&older.getOlderBmi()<800){
            older.setOlderState(2);
        }
        else {
            older.setOlderState(3);
        }
        OlderService.update(older);
        return DiagnosisService.update(diagnosis);
    }
}
