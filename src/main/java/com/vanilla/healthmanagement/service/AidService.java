package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Aid;

import java.util.List;

/*急救管理
 * 20-1-3Vanilla
 * */

public interface AidService {
    List<Aid> getAids(Aid aid);
    List<Aid> getAll(Aid aid);
    Aid getAidById(int id);
    int add(Aid aid);
    int del(Aid aid);
    //    int del(Integer id);
    int update(Aid aid);

}
