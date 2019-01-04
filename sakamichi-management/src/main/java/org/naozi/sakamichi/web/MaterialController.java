package org.naozi.sakamichi.web;

import org.naozi.sakamichi.dao.domain.ResultBean;
import org.naozi.sakamichi.dao.model.Material;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author 脑子Naozi
 * @date 2017/8/6
 */
@Controller
@RequestMapping("/material")
public class MaterialController {

    /**
     * 跳转文章素材页面
     * @return
     */
    @RequestMapping("/toArticleMaterial")
    public ModelAndView toArticleMaterial(){
        return new ModelAndView("/material/articleMaterialList");
    }

    /**
     * 跳转图片素材页面
     * @return
     */
    @RequestMapping("/toImageMaterial")
    public ModelAndView toImageMaterial(){
        return new ModelAndView("/material/imageMaterialList");
    }

    /**
     * 跳转音频素材页面
     * @return
     */
    @RequestMapping("/toAudioMaterial")
    public ModelAndView toAudioMaterial(){
        return new ModelAndView("/material/audioMaterialList");
    }


    /**
     * 跳转图片素材编辑页面
     * @param materialId
     * @return
     */
    @RequestMapping("/toEditImageMaterial/{materialId}")
    public ModelAndView toEditImageMaterial(@PathVariable Long materialId){
        ModelAndView view = new ModelAndView("/material/imageMaterialEdit");
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
    public ResultBean addMaterial(Material material){
        return null;
    }

}
