package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.*;
import com.vanilla.healthmanagement.service.DiagnosisService;
import com.vanilla.healthmanagement.service.ExamService;
import com.vanilla.healthmanagement.service.VisitsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*老人
* 19-1-2Vanilla
* */

@RestController
@RequestMapping("/older")
public class OlderController {
    @Resource
    com.vanilla.healthmanagement.service.OlderService OlderService;
    @Resource
    com.vanilla.healthmanagement.service.MemberService MemberService;
    @Resource
    com.vanilla.healthmanagement.service.ExamService ExamService;
    @Resource
    com.vanilla.healthmanagement.service.DiagnosisService DiagnosisService;
    @Resource
    com.vanilla.healthmanagement.service.VisitsService VisitsService;
    @Resource
    com.vanilla.healthmanagement.service.AidService AidService;
    @GetMapping("/list")
    public PageInfo<Older> getOlder(Older older){
        List<Older> olders =OlderService.getOlders(older);
        PageInfo<Older> pageInfo = new PageInfo<>(olders);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Older> getAll(Older older){
//        Older.setActive(1);
        return OlderService.getAll(older);
    }
    @PostMapping("/add")
    public int add(Older older){
        return OlderService.add(older);
    }
    @GetMapping("/del")
    public int del(Older older){
        return OlderService.update(older);
    }

    @PostMapping("/update")
    public int update(Older older){
        return OlderService.update(older);
    }
    @GetMapping("/getOne")
    public Older getOne(Integer id){
        return OlderService.getOlderById(id);
    }

/*19-12-29管理员登录*/

    @CrossOrigin(allowCredentials = "true")
    @PostMapping("/login")
    public Older login(@Param("olderName") String olderName, @Param("olderPassword") String olderPassword, HttpServletResponse response) {
        Older older = OlderService.getByNameAndPwd(olderName, olderPassword);
//        session.setAttribute("older",older);
//        System.out.println("session"+older.getOlderName());
//        OldernamePasswordToken token = new OldernamePasswordToken(olderName, olderPwd);
        System.out.printf("oldername");
        Cookie cookie = new Cookie("olderName", older.getOlderName());
        cookie.setMaxAge(24 * 60 * 60); //存活期为1天
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie" + cookie.getValue());
        return older;
    }
    //    @MyLog(value = "退出")  //这里添加了AOP的自定义注解
/*20-1-2管理员退出
    * */

    @GetMapping("/logout")
    public Integer logout(HttpServletRequest request,
                          HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                cookie.setMaxAge(0);//销毁cookie
                response.addCookie(cookie);
            }
            return 2;
        }
        return 1;
    }
   /*上传图片*/
    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "E:\\git_position\\health\\M\\static\\older_photourl\\"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = fileName;
        return filename;
    }

    /*老人个人中心数据*/
    @GetMapping("/getAllInformation")
    public Map<String,List<?>> getAllInformation(Older older){
        Map<String,List<?>> map = new HashMap<>();
        System.out.println("老人id"+older.getId());
        /*家庭成员列表*/
        Member member=new Member();
        member.setOlderId(older.getId());
        /*体检列表*/
        Exam exam=new Exam();
        exam.setOlderId(older.getId());
        /*诊断列表*/
        Diagnosis diagnosis=new Diagnosis();
        diagnosis.setOlderId(older.getId());
        /*随访列表*/
        Visits visits=new Visits();
        visits.setOlderId(older.getId());
        /*急救列表*/
        Aid aid=new Aid();
        aid.setOlderId(older.getId());

        map.put("members", MemberService.getAll(member));
        map.put("exams", ExamService.getAll(exam));
        map.put("diagnosiss", DiagnosisService.getAll(diagnosis));
        map.put("visitss", VisitsService.getAll(visits));
        map.put("aids", AidService.getAll(aid));
        return map;
    }
}
