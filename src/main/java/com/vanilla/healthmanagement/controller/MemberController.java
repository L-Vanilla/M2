package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Member;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/*家庭成员管理
* 19-1-2Vanilla
* */

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    com.vanilla.healthmanagement.service.MemberService MemberService;
    @GetMapping("/list")
    public PageInfo<Member> getMember(Member member){
        List<Member> members =MemberService.getMembers(member);
        PageInfo<Member> pageInfo = new PageInfo<>(members);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Member> getAll(Member member){
//        Member.setActive(1);
        return MemberService.getAll(member);
    }
    @PostMapping("/add")
    public int add(Member member){
        return MemberService.add(member);
    }
    @GetMapping("/del")
    public int del(Member member){
        return MemberService.update(member);
    }

    @PostMapping("/update")
    public int update(@Valid Member member, BindingResult bindingResult){
        return MemberService.update(member);
    }
    @GetMapping("/getOne")
    public Member getOne(Integer id){
        return MemberService.getMemberById(id);
    }

}
