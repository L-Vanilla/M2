package com.vanilla.healthmanagement.controller;

import com.github.pagehelper.PageInfo;
import com.vanilla.healthmanagement.pojo.Visits;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.*;
import java.util.List;
import java.util.UUID;


/*随访信息管理
* 19-1-3Vanilla
* */

@RestController
@RequestMapping("/visits")
public class VisitsController {
    @Resource
    com.vanilla.healthmanagement.service.VisitsService VisitsService;
    @GetMapping("/list")
    public PageInfo<Visits> getVisits(Visits visits){
        List<Visits> visitss =VisitsService.getVisitss(visits);
        PageInfo<Visits> pageInfo = new PageInfo<>(visitss);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Visits> getAll(Visits visits){
//        Visits.setActive(1);
        return VisitsService.getAll(visits);
    }
    @PostMapping("/add")
    public int add(Visits visits){
        return VisitsService.add(visits);
    }
    @GetMapping("/del")
    public int del(Visits visits){
        return VisitsService.update(visits);
    }
    /*修改随访状态*/
    @GetMapping("/updateVisitsState")
    public int updateVisitsState(Visits visits){
        return VisitsService.update(visits);
    }
    @PostMapping("/update")
    public int update(@Valid Visits visits, BindingResult bindingResult){
        return VisitsService.update(visits);
    }
    @GetMapping("/getOne")
    public Visits getOne(Integer id){
        return VisitsService.getVisitsById(id);
    }
    /*文件的上传*/
    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "E:\\git_position\\health\\M\\static\\visits_exam\\"; // 上传后的路径
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
    /*文件的下载*/
//    @RequestMapping("/download")
//    public Object downloadFile(@RequestParam String fileName, final HttpServletResponse response, final HttpServletRequest request){
//        OutputStream os = null;
//        InputStream is= null;
//        try {
//            // 取得输出流
//            os = response.getOutputStream();
//            // 清空输出流
//            response.reset();
//            response.setContentType("application/x-download;charset=GBK");
//            response.setHeader("Content-Disposition", "attachment;filename="+ new String(fileName.getBytes("utf-8"), "iso-8859-1"));
//            //读取流
//            String rootPath="E:\\git_position\\health\\M\\static\\visits_exam\\";
//            File f = new File(rootPath+fileName);
//            is = new FileInputStream(f);
////            if (is == null) {
////                logger.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
////                return ResultUtil.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
////            }
//            //复制
//            IOUtils.copy(is, response.getOutputStream());
//            response.getOutputStream().flush();
//        } catch (IOException e) {
//            return "下载失败";
//        }
//        //文件的关闭放在finally中
//        finally
//        {
//            try {
//                if (is != null) {
//                    is.close();
//                }
//            } catch (IOException e) {
//
//            }
//            try {
//                if (os != null) {
//                    os.close();
//                }
//            } catch (IOException e) {
//            }
//        }
//        return null;
//    }
}
