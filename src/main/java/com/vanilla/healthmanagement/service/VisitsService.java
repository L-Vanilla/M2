package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Visits;

import java.util.List;

/*随访管理
 * 20-1-3Vanilla
 * */

public interface VisitsService {
    List<Visits> getVisitss(Visits visits);
    List<Visits> getAll(Visits visits);
    Visits getVisitsById(int id);
    int add(Visits visits);
    int del(Visits visits);
    //    int del(Integer id);
    int update(Visits visits);

}
