package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Older;

import java.util.List;
import java.util.Map;

/*老人管理
 * 20-1-2Vanilla
 * */

public interface OlderService {
    List<Older> getOlders(Older older);
    List<Older> getAll(Older older);
    Older getOlderById(int id);
    int add(Older older);
    int del(Older older);
    //    int del(Integer id);
    int update(Older older);

    /*19-12-29用户登录*/
    Older getByNameAndPwd(String name, String password);

    /*20-1-7统计老人性别*/
    List<Map<String,String>> Sum_OlderSex();

    /*20-1-7统计老人健康状态*/
    List<Map<String,String>> Sum_OlderHealthState();
    /*20-1-7统计老人年龄分布*/
    List<Map<String,String>> Sum_OlderAge();
}
