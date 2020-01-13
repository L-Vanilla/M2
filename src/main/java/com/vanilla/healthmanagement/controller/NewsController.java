package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;


import com.vanilla.healthmanagement.pojo.HealthCare;
import com.vanilla.healthmanagement.pojo.News;
import com.vanilla.healthmanagement.pojo.Notice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*新闻管理
* 12-19Vanilla
* */
@RestController
@RequestMapping("/news")
public class NewsController {
    @Resource
    com.vanilla.healthmanagement.service.NewsService NewsService;
    @Resource
    com.vanilla.healthmanagement.service.HealthCareService HealthCareService;
    @Resource
    com.vanilla.healthmanagement.service.NoticeService NoticeService;
    @GetMapping("/list")
    public PageInfo<News> getNews(News news){
        List<News> newss =NewsService.getNewss(news);
        PageInfo<News> pageInfo = new PageInfo<>(newss);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<News> getAll(News news){
//        News.setActive(1);
        return NewsService.getAll(news);
    }
    /*修改点击率*/
    @GetMapping("/updateClickNum")
    public int updateClickNum(News news){
        return NewsService.update(news);
    }
    @PostMapping("/add")
    public int add(News news){
        return NewsService.add(news);
    }
    @GetMapping("/del")
    public int del(News news){
        return NewsService.update(news);
    }

    @PostMapping("/update")
    public int update(News news){
        return NewsService.update(news);
    }
    @GetMapping("/getOne")
    public News getOne(Integer id){
        return NewsService.getNewsById(id);
    }

    /*查询首页所有信息*/
    @GetMapping("/getAllInformation")
    public Map<String,PageInfo<?>> getAllRoomsAndLeaguers(News news){
        Map<String,PageInfo<?>> map = new HashMap<>();
        /*新闻列表*/
        List<News> newss =NewsService.getNewss(news);
        PageInfo<News> pageInfo=new PageInfo<>(newss);
        /*养生保健列表*/
        HealthCare healthCare=new HealthCare();
        healthCare.setPageSize(news.getPageSize());
        healthCare.setPageNo(news.getPageNo());
        healthCare.sethType("养生保健");
        List<HealthCare> healthCares=HealthCareService.getHealthCares(healthCare);
        PageInfo<HealthCare> pageInfo1=new PageInfo<>(healthCares);
        /*预防知识列表*/
        HealthCare prevention=new HealthCare();
        prevention.setPageSize(news.getPageSize());
        prevention.setPageNo(news.getPageNo());
        prevention.sethType("预防知识");
        List<HealthCare> preventions=HealthCareService.getHealthCares(prevention);
        PageInfo<HealthCare> pageInfo2=new PageInfo<>(preventions);
        /*健康教育列表*/
        HealthCare education=new HealthCare();
        education.setPageSize(news.getPageSize());
        education.setPageNo(news.getPageNo());
        education.sethType("健康教育");
        List<HealthCare> educations=HealthCareService.getHealthCares(education);
        PageInfo<HealthCare> pageInfo3=new PageInfo<>(educations);
        /*公告*/
        Notice notice=new Notice();
        notice.setPageSize(news.getPageSize());
        notice.setPageNo(news.getPageNo());
        List<Notice> notices=NoticeService.getNotices(notice);
        PageInfo<Notice> pageInfo4=new PageInfo<>(notices);
        map.put("newss", pageInfo);
        map.put("cares", pageInfo1);
        map.put("preventions", pageInfo2);
        map.put("educations", pageInfo3);
        map.put("notices", pageInfo4);
        return map;
    }

}
