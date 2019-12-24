package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.AdminMapper;
import com.vanilla.healthmanagement.pojo.Admin;
import com.vanilla.healthmanagement.pojo.AdminExample;
import com.vanilla.healthmanagement.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*公告
 * 12-22Vanilla
 * */
@Service
@Primary
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper AdminMapper;
    @Override
    public List<Admin> getAdmins(Admin admin) {

        PageHelper.startPage(admin.getPageNo(), admin.getPageSize());
        AdminExample AdminExample = new AdminExample();
        AdminExample.Criteria criteria = AdminExample.createCriteria();
        if (StringUtils.isNotBlank(admin.getName())) {
            criteria.andNameLike("%" + admin.getName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        AdminExample.setOrderByClause("id desc");
//        if(Admin.getActive()!=null)
//            criteria.andActiveEqualTo(Admin.getActive());

        return AdminMapper.selectByExample(AdminExample);
    }

    @Override
    public List<Admin> getAll(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return AdminMapper.selectByExample(adminExample);
    }

    @Override
    public Admin getAdminById(int id) {
        return AdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Admin admin) {
        admin.setCreateDate(new Date());
        return AdminMapper.insertSelective(admin);
    }

    @Override
    public int del(Admin admin) {
        return AdminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int update(Admin admin) {
        return AdminMapper.updateByPrimaryKeySelective(admin);
    }

}
