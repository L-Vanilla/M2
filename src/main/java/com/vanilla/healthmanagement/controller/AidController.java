package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Aid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/*急救信息管理
* 19-1-3Vanilla
* */

@RestController
@RequestMapping("/aid")
public class AidController {
    @Resource
    com.vanilla.healthmanagement.service.AidService AidService;
    @GetMapping("/list")
    public PageInfo<Aid> getAid(Aid aid){
        List<Aid> aids =AidService.getAids(aid);
        PageInfo<Aid> pageInfo = new PageInfo<>(aids);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Aid> getAll(Aid aid){
//        Aid.setActive(1);
        return AidService.getAll(aid);
    }
    @PostMapping("/add")
    public int add(Aid aid){
        return AidService.add(aid);
    }
    @GetMapping("/del")
    public int del(Aid aid){
        return AidService.update(aid);
    }

    @PostMapping("/update")
    public int update(@Valid Aid aid, BindingResult bindingResult){
        return AidService.update(aid);
    }
    @GetMapping("/getOne")
    public Aid getOne(Integer id){
        return AidService.getAidById(id);
    }

}
