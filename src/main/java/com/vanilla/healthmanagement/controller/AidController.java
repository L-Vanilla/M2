package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Aid;
import com.vanilla.healthmanagement.pojo.Older;
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
    @Resource
    com.vanilla.healthmanagement.service.OlderService OlderService;
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

    /*修改等级状态*/
    @GetMapping("/updateRank")
    public int updateRank(Aid aid){
        aid.setCheckState(1);
        Older older=new Older();
        older= OlderService.getOlderById(aid.getOlderId());
        /*等级*/
        if(aid.getRank()==1){
            older.setOlderBmi(older.getOlderBmi()-5);
        }
        else if(aid.getRank()==2){
            older.setOlderBmi(older.getOlderBmi()-10);
        }
        else {
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
        else if (older.getOlderBmi()<600){
            older.setOlderState(3);
        }
        OlderService.update(older);
        return AidService.update(aid);
    }
}
