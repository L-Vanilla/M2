package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Worker;

import java.util.List;

/*社区工作者管理
 * 12-28Vanilla
 * */
public interface WorkerService {
    List<Worker> getWorkers(Worker worker);
    List<Worker> getAll(Worker worker);
    Worker getWorkerById(int id);
    int add(Worker worker);
    int del(Worker worker);
    //    int del(Integer id);
    int update(Worker worker);
}
