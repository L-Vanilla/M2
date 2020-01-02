package com.vanilla.healthmanagement.service.impl;

import com.github.pagehelper.PageHelper;
import com.vanilla.healthmanagement.dao.MemberMapper;
import com.vanilla.healthmanagement.pojo.Member;
import com.vanilla.healthmanagement.pojo.MemberExample;
import com.vanilla.healthmanagement.service.MemberService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*家庭成员管理
 * 20-1-2Vanilla
 * */

@Service
@Primary
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper MemberMapper;
    @Override
    public List<Member> getMembers(Member member) {

        PageHelper.startPage(member.getPageNo(), member.getPageSize());
        MemberExample MemberExample = new MemberExample();
        MemberExample.Criteria criteria = MemberExample.createCriteria();
        if (StringUtils.isNotBlank(member.getMemberName())) {
            criteria.andMemberNameLike("%" + member.getMemberName() + "%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
        MemberExample.setOrderByClause("id desc");
//        if(Member.getActive()!=null)
//            criteria.andActiveEqualTo(Member.getActive());

        return MemberMapper.selectByExample(MemberExample);
    }

    @Override
    public List<Member> getAll(Member member) {
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return MemberMapper.selectByExample(memberExample);
    }

    @Override
    public Member getMemberById(int id) {
        return MemberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Member member) {
        member.setCreateDate(new Date());
        return MemberMapper.insertSelective(member);
    }

    @Override
    public int del(Member member) {
        return MemberMapper.updateByPrimaryKeySelective(member);
    }

    @Override
    public int update(Member member) {
        return MemberMapper.updateByPrimaryKeySelective(member);
    }


}
