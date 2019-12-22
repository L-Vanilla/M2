package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.HealthCare;

import java.util.List;

/*养生保健
 * 12-21Vanilla
 * */
public interface HealthCareService {
    List<HealthCare> getHealthCares(HealthCare healthCare);
    List<HealthCare> getAll(HealthCare healthCare);
    HealthCare getHealthCareById(int id);
    int add(HealthCare healthCare);
    int del(HealthCare healthCare);
    //    int del(Integer id);
    int update(HealthCare healthCare);
}
