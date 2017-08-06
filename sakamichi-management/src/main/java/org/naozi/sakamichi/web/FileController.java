package org.naozi.sakamichi.web;

import org.naozi.sakamichi.dao.domain.ResultBean;
import org.naozi.sakamichi.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 脑子Naozi on 2017/8/6.
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    /**
     * 上传图片
     * @param file
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping("/uploadImage")
    public ResultBean uploadImage(MultipartFile file, String name){
        ResultBean resultBean = fileService.uploadImage(file);
        return resultBean;
    }

    /**
     * 下载图片
     * @param response
     * @param imageName
     */
    @RequestMapping("/getImage/{imageName}")
    public void getImage(HttpServletResponse response,@PathVariable String imageName){
        fileService.getFile(response,imageName);
    }
}
