package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Admin;

import java.util.List;

/*管理员
 * 12-22Vanilla
 * */
public interface AdminService {
    List<Admin> getAdmins(Admin admin);
    List<Admin> getAll(Admin admin);
    Admin getAdminById(int id);
    int add(Admin admin);
    int del(Admin admin);
    //    int del(Integer id);
    int update(Admin admin);
    /*19-12-29用户登录*/
    Admin getByNameAndPwd(String name, String password);
}
