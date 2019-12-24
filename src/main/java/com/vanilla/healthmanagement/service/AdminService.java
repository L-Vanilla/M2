package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Admin;

import java.util.List;

/*公告
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
}
