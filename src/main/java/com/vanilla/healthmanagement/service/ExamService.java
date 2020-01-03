package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Exam;

import java.util.List;

/*体检管理
 * 20-1-3Vanilla
 * */

public interface ExamService {
    List<Exam> getExams(Exam exam);
    List<Exam> getAll(Exam exam);
    Exam getExamById(int id);
    int add(Exam exam);
    int del(Exam exam);
    //    int del(Integer id);
    int update(Exam exam);

}
