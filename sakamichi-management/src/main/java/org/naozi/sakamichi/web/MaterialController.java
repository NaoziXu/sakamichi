package org.naozi.sakamichi.web;

import org.naozi.sakamichi.dao.domain.ResultBean;
import org.naozi.sakamichi.dao.model.SakamichiMaterial;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 脑子Naozi on 2017/8/6.
 */
@Controller
@RequestMapping("/material")
public class MaterialController {

    @Value("${server.contextPath}")
    private String appName;

    private String pagePath = "/material/";

    /**
     * 跳转图片素材页面
     * @param request
     * @return
     */
    @RequestMapping("/toImageMaterial")
    public ModelAndView toImageMaterial(HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView(pagePath + "imageMaterial");
        view.addObject("bathPath", bathPath);
        return view;
    }

    /**
     * 跳转图文素材页面
     * @param request
     * @return
     */
    @RequestMapping("/toImageTextMaterial")
    public ModelAndView toImageTextMaterial(HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView(pagePath + "imageTextMaterial");
        view.addObject("bathPath", bathPath);
        return view;
    }

    /**
     * 跳转文章素材页面
     * @param request
     * @return
     */
    @RequestMapping("/toArticleMaterial")
    public ModelAndView toArticleMaterial(HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView(pagePath + "articleMaterial");
        view.addObject("bathPath", bathPath);
        return view;
    }

    /**
     * 跳转图片素材编辑页面
     * @param materialId
     * @param request
     * @return
     */
    @RequestMapping("/toEditImageMaterial/{materialId}")
    public ModelAndView toEditImageMaterial(@PathVariable Long materialId, HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView(pagePath + "imageMaterialEdit");
        view.addObject("bathPath", bathPath);
        view.addObject("materialId", materialId);
        return view;
    }

    /**
     * 新增素材
     * @param material
     * @return
     */
    @ResponseBody
    @RequestMapping("/addMaterial")
    public ResultBean addMaterial(SakamichiMaterial material){
        return null;
    }

}
