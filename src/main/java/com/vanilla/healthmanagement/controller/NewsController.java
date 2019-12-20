package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;


import com.vanilla.healthmanagement.pojo.News;
import com.vanilla.healthmanagement.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*新闻管理
* 12-19Vanilla
* */
@RestController
@RequestMapping("/news")
public class NewsController {
    @Resource
    com.vanilla.healthmanagement.service.NewsService NewsService;
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

}
