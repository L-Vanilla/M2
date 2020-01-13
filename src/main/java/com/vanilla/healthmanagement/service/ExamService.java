package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Exam;

import java.util.List;
import java.util.Map;

/*体检管理
 * 20-1-3Vanilla
 * */

public interface ExamService {
    List<Exam> getExams(Exam exam);
    List<Exam> getExamsByOrderId(Exam exam);
    List<Exam> getAll(Exam exam);
    Exam getExamById(int id);
    int add(Exam exam);
    int del(Exam exam);
    //    int del(Integer id);
    int update(Exam exam);

    /*统计高压值*/
    List<Map<String,String>> Sum_examHighbp();
    /*统计低压值*/
    List<Map<String,String>> Sum_examLowbp();

}
