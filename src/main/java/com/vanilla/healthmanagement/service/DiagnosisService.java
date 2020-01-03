package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Diagnosis;

import java.util.List;

/*诊断信息管理
 * 20-1-3Vanilla
 * */

public interface DiagnosisService {
    List<Diagnosis> getDiagnosiss(Diagnosis diagnosis);
    List<Diagnosis> getAll(Diagnosis diagnosis);
    Diagnosis getDiagnosisById(int id);
    int add(Diagnosis diagnosis);
    int del(Diagnosis diagnosis);
    //    int del(Integer id);
    int update(Diagnosis diagnosis);

}
