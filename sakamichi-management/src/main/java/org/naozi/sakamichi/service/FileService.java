package org.naozi.sakamichi.service;

import org.apache.commons.lang3.StringUtils;
import org.naozi.sakamichi.dao.domain.ResultBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

/**
 * @author 脑子Naozi
 * @date 2017/8/6
 */
@Service
public class FileService {

    @Value("${sakamichi.file.path}")
    private String filePath;

    /**
     * 上传图片
     * @param file
     * @return
     */
    public ResultBean uploadImage(MultipartFile file){
        if (!file.isEmpty()) {
            try {
                String surfix = getFileSurfix(file);
                String surfixUpper = surfix.toUpperCase();
                if(StringUtils.isNotEmpty(surfixUpper) &&
                        ("PNG".equals(surfixUpper) || "JPEG".equals(surfixUpper)
                                || "BMP".equals(surfixUpper) || "JPG".equals(surfixUpper))){
                    String fileName = "IMAGE_" + System.currentTimeMillis() + "." + surfix;
                    byte[] bytes = file.getBytes();
                    BufferedOutputStream buffStream =
                            new BufferedOutputStream(new FileOutputStream(new File(filePath + "/" + fileName)));
                    buffStream.write(bytes);
                    buffStream.close();
                    return ResultBean.success("upload success",fileName);
                } else {
                    return ResultBean.failed("invalid image type");
                }
            } catch (Exception e) {
                e.fillInStackTrace();
                return ResultBean.error("upload failed");
            }
        } else {
            return ResultBean.failed("empty file");
        }
    }

    /**
     * 用流输出文件
     * @param response
     * @param fileName
     */
    public void getFile(HttpServletResponse response, String fileName){
        BufferedInputStream inputStream = null;
        OutputStream out = null;
        try {
            if(StringUtils.isNotEmpty(fileName)) {
                File file = new File(filePath + "/" + fileName);
                if (!file.exists()) {
                    response.sendError(404, "File not found");
                    return;
                }
                inputStream = new BufferedInputStream(new FileInputStream(file));
                byte[] buf = new byte[1024];
                int len = 0;
                response.setContentType("multipart/form-data");
                out = response.getOutputStream();
                while ((len = inputStream.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取文件后缀
     * @param file
     * @return
     */
    private String getFileSurfix(MultipartFile file) {
        if (!file.isEmpty()) {
            String fileName = file.getName();
            String surfix = fileName.split(".")[1];
            return surfix;
        }
        else {
            return null;
        }
    }
}
