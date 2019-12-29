package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    /*19-12-29管理员登录*/
    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/login")
    public Admin login(@Param("name") String name, @Param("password") String password, HttpServletResponse response) {
        Admin admin = AdminService.getByNameAndPwd(name, password);
//        session.setAttribute("admin",admin);
//        System.out.println("session"+admin.getAdminName());
//        AdminnamePasswordToken token = new AdminnamePasswordToken(adminName, adminPwd);
        Cookie cookie = new Cookie("adminName", admin.getName());
        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie" + cookie.getValue());
        return admin;
    }
    //    @MyLog(value = "退出")  //这里添加了AOP的自定义注解
    /*19-12-29管理员退出
    * */
    @GetMapping("/logout")
    public Integer logout(HttpServletRequest request,
                          HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                cookie.setMaxAge(0);//销毁cookie
                response.addCookie(cookie);
            }
        }
        return 1;
    }


}
