package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Worker;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.UUID;

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

    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file,  HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "E:\\git_position\\health\\M\\static\\worker_photourl\\"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = fileName;
        return filename;
    }

}
