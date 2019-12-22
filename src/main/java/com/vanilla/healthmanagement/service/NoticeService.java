package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Notice;

import java.util.List;

/*公告
 * 12-22Vanilla
 * */
public interface NoticeService {
    List<Notice> getNotices(Notice notice);
    List<Notice> getAll(Notice notice);
    Notice getNoticeById(int id);
    int add(Notice notice);
    int del(Notice notice);
    //    int del(Integer id);
    int update(Notice notice);
}
