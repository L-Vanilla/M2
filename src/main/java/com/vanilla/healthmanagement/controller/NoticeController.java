package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Notice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*公告
* 12-23Vanilla
* */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    com.vanilla.healthmanagement.service.NoticeService NoticeService;
    @GetMapping("/list")
    public PageInfo<Notice> getNotice(Notice notice){
        List<Notice> notices =NoticeService.getNotices(notice);
        PageInfo<Notice> pageInfo = new PageInfo<>(notices);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Notice> getAll(Notice notice){
//        Notice.setActive(1);
        return NoticeService.getAll(notice);
    }
    @PostMapping("/add")
    public int add(Notice notice){
        return NoticeService.add(notice);
    }
    @GetMapping("/del")
    public int del(Notice notice){
        return NoticeService.update(notice);
    }

    @PostMapping("/update")
    public int update(Notice notice){
        return NoticeService.update(notice);
    }
    @GetMapping("/getOne")
    public Notice getOne(Integer id){
        return NoticeService.getNoticeById(id);
    }

}
