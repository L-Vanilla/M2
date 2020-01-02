package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Older;

import java.util.List;

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
}
