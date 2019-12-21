package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.NewsMapper;
import com.vanilla.healthmanagement.pojo.News;
import com.vanilla.healthmanagement.pojo.NewsExample;

import com.vanilla.healthmanagement.service.NewsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*新闻管理
 * 12-19Vanilla
 * */
@Service
@Primary
public class NewsServiceImpl implements NewsService {
    @Resource
    NewsMapper NewsMapper;
    @Override
    public List<News> getNewss(News News) {

        PageHelper.startPage(News.getPageNo(), News.getPageSize());
        NewsExample NewsExample = new NewsExample();
        NewsExample.Criteria criteria = NewsExample.createCriteria();
        if (StringUtils.isNotBlank(News.getTitle())) {
            criteria.andTitleLike("%" + News.getTitle() + "%").andActiveEqualTo(1);
        }else {
            criteria.andActiveEqualTo(1);
        }
        NewsExample.setOrderByClause("id desc");
//        if(News.getActive()!=null)
//            criteria.andActiveEqualTo(News.getActive());

        return NewsMapper.selectByExample(NewsExample);
    }

    @Override
    public List<News> getAll(News News) {
        NewsExample NewsExample = new NewsExample();
        NewsExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return NewsMapper.selectByExample(NewsExample);
    }

    @Override
    public News getNewsById(int id) {
        return NewsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(News News) {
        News.setCreateDate(new Date());
        return NewsMapper.insertSelective(News);
    }

    @Override
    public int del(News News) {
        return NewsMapper.updateByPrimaryKeySelective(News);
    }

    @Override
    public int update(News News) {
        return NewsMapper.updateByPrimaryKeySelective(News);
    }

}
