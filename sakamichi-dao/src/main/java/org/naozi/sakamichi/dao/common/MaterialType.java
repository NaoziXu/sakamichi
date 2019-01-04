package org.naozi.sakamichi.dao.common;

/**
 * @author 脑子Naozi
 * @date 2017/8/5
 */
public enum MaterialType {

    /**
     * 文章素材
     */
    ARTICLE_MATERIAL,
    /**
     * 图片素材
     */
    IMAGE_MATERIAL,
    /**
     * 音频素材
     */
    AUDIO_MATERIAL;

    /**
     * 根据db状态获取类型
     * @param dbType
     * @return
     */
    public MaterialType getCommentType(int dbType){
        switch (dbType) {
            case 0 :
                return ARTICLE_MATERIAL;
            case 1 :
                return IMAGE_MATERIAL;
            case 2 :
                return AUDIO_MATERIAL;
            default:
                return null;
        }
    }

    /**
     * 根据状态类型获取db状态
     * @param materialType
     * @return
     */
    public Integer getDbType(MaterialType materialType){
        switch (materialType) {
            case ARTICLE_MATERIAL:
                return 0;
            case IMAGE_MATERIAL:
                return 1;
            case AUDIO_MATERIAL:
                return 2;
            default:
                return null;
        }
    }
}
