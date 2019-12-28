package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.WorkerMapper;
import com.vanilla.healthmanagement.pojo.Worker;
import com.vanilla.healthmanagement.pojo.WorkerExample;
import com.vanilla.healthmanagement.service.WorkerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*社区工作者管理
 * 12-28Vanilla
 * */
@Service
@Primary
public class WorkerServiceImpl implements WorkerService {
    @Resource
    WorkerMapper WorkerMapper;
    @Override
    public List<Worker> getWorkers(Worker worker) {

        PageHelper.startPage(worker.getPageNo(), worker.getPageSize());
        WorkerExample WorkerExample = new WorkerExample();
        WorkerExample.Criteria criteria = WorkerExample.createCriteria();
        /*根据社区工作者姓名进行模糊搜索*/
        if (StringUtils.isNotBlank(worker.getWorkerName())) {
            criteria.andWorkerNameLike("%" + worker.getWorkerName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        WorkerExample.setOrderByClause("id desc");
//        if(Worker.getActive()!=null)
//            criteria.andActiveEqualTo(Worker.getActive());

        return WorkerMapper.selectByExample(WorkerExample);
    }

    @Override
    public List<Worker> getAll(Worker worker) {
        WorkerExample workerExample = new WorkerExample();
        workerExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return WorkerMapper.selectByExample(workerExample);
    }

    @Override
    public Worker getWorkerById(int id) {
        return WorkerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Worker worker) {
        worker.setCreateDate(new Date());
        return WorkerMapper.insertSelective(worker);
    }

    @Override
    public int del(Worker worker) {
        return WorkerMapper.updateByPrimaryKeySelective(worker);
    }

    @Override
    public int update(Worker worker) {
        return WorkerMapper.updateByPrimaryKeySelective(worker);
    }

}
