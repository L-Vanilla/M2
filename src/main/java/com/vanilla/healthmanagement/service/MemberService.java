package com.vanilla.healthmanagement.service;


import com.vanilla.healthmanagement.pojo.Member;

import java.util.List;

/*家庭成员管理
 * 20-1-2Vanilla
 * */

public interface MemberService {
    List<Member> getMembers(Member member);
    List<Member> getAll(Member member);
    Member getMemberById(int id);
    int add(Member member);
    int del(Member member);
    //    int del(Integer id);
    int update(Member member);

}
