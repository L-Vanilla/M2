package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*公告
* 12-23Vanilla
* */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    com.vanilla.healthmanagement.service.AdminService AdminService;
    @GetMapping("/list")
    public PageInfo<Admin> getAdmin(Admin admin){
        List<Admin> admins =AdminService.getAdmins(admin);
        PageInfo<Admin> pageInfo = new PageInfo<>(admins);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Admin> getAll(Admin admin){
//        Admin.setActive(1);
        return AdminService.getAll(admin);
    }
    @PostMapping("/add")
    public int add(Admin admin){
        return AdminService.add(admin);
    }
    @GetMapping("/del")
    public int del(Admin admin){
        return AdminService.update(admin);
    }

    @PostMapping("/update")
    public int update(Admin admin){
        return AdminService.update(admin);
    }
    @GetMapping("/getOne")
    public Admin getOne(Integer id){
        return AdminService.getAdminById(id);
    }

}
