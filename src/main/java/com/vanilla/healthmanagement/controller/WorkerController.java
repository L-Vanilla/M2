package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*社区工作者管理
* 12-28Vanilla
* */
@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Resource
    com.vanilla.healthmanagement.service.WorkerService WorkerService;
    @GetMapping("/list")
    public PageInfo<Worker> getWorker(Worker worker){
        List<Worker> workers =WorkerService.getWorkers(worker);
        PageInfo<Worker> pageInfo = new PageInfo<>(workers);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Worker> getAll(Worker worker){
//        Worker.setActive(1);
        return WorkerService.getAll(worker);
    }
    @PostMapping("/add")
    public int add(Worker worker){
        return WorkerService.add(worker);
    }
    @GetMapping("/del")
    public int del(Worker worker){
        return WorkerService.update(worker);
    }

    @PostMapping("/update")
    public int update(Worker worker){
        return WorkerService.update(worker);
    }
    @GetMapping("/getOne")
    public Worker getOne(Integer id){
        return WorkerService.getWorkerById(id);
    }

}
