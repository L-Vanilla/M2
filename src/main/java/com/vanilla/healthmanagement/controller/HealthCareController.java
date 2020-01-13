package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.HealthCare;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*养生保健
* 12-21Vanilla
* */
@RestController
@RequestMapping("/healthCare")
public class HealthCareController {
    @Resource
    com.vanilla.healthmanagement.service.HealthCareService HealthCareService;
    @GetMapping("/list")
    public PageInfo<HealthCare> getHealthCare(HealthCare healthCare){
        List<HealthCare> healthCares =HealthCareService.getHealthCares(healthCare);
        PageInfo<HealthCare> pageInfo = new PageInfo<>(healthCares);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<HealthCare> getAll(HealthCare healthCare){
//        HealthCare.setActive(1);
        return HealthCareService.getAll(healthCare);
    }
    /*修改点击率*/
    @GetMapping("/updateClickNum")
    public int updateClickNum(HealthCare healthCare){
        return HealthCareService.update(healthCare);
    }
    @PostMapping("/add")
    public int add(HealthCare healthCare){
        return HealthCareService.add(healthCare);
    }
    @GetMapping("/del")
    public int del(HealthCare healthCare){
        return HealthCareService.update(healthCare);
    }

    @PostMapping("/update")
    public int update(HealthCare healthCare){
        return HealthCareService.update(healthCare);
    }
    @GetMapping("/getOne")
    public HealthCare getOne(Integer id){
        return HealthCareService.getHealthCareById(id);
    }

}
