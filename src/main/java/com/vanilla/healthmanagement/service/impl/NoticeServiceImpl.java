package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.NoticeMapper;
import com.vanilla.healthmanagement.pojo.Notice;
import com.vanilla.healthmanagement.pojo.NoticeExample;
import com.vanilla.healthmanagement.service.NoticeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/*公告
 * 12-22Vanilla
 * */

@Service
@Primary
public class NoticeServiceImpl implements NoticeService {
    @Resource
    NoticeMapper NoticeMapper;
    @Override
    public List<Notice> getNotices(Notice notice) {

        PageHelper.startPage(notice.getPageNo(), notice.getPageSize());
        NoticeExample NoticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = NoticeExample.createCriteria();
        if (StringUtils.isNotBlank(notice.getTitle())) {
            criteria.andTitleLike("%" + notice.getTitle() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        NoticeExample.setOrderByClause("id desc");
        return NoticeMapper.selectByExample(NoticeExample);
    }

    @Override
    public List<Notice> getAll(Notice notice) {
        NoticeExample noticeExample = new NoticeExample();
        noticeExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return NoticeMapper.selectByExample(noticeExample);
    }

    @Override
    public Notice getNoticeById(int id) {
        return NoticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Notice notice) {
        notice.setCreateDate(new Date());
        return NoticeMapper.insertSelective(notice);
    }

    @Override
    public int del(Notice notice) {
        return NoticeMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public int update(Notice notice) {
        return NoticeMapper.updateByPrimaryKeySelective(notice);
    }

}
