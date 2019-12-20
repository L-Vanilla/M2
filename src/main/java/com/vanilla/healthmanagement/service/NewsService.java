package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.News;

import java.util.List;

/*新闻管理
 * 12-19Vanilla
 * */
public interface NewsService {
    List<News> getNewss(News News);
    List<News> getAll(News News);
    News getNewsById(int id);
    int add(News News);
    int del(News News);
    //    int del(Integer id);
    int update(News News);
}
