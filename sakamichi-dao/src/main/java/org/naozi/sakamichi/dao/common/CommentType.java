package org.naozi.sakamichi.dao.common;

/**
 * 评论种类
 * @author 脑子Naozi
 * @date 2017/8/5
 */
public enum CommentType {

    /**
     * 主页留言
     */
    INDEX_COMMENT,
    /**
     * 素材评论
     */
    MATERIAL_COMMENT,
    /**
     * 微博评论
     */
    MICROBLOG_COMMENT,
    /**
     * 预留
     */
    OTHER_COMMENT;

    /**
     * 根据db状态获取类型
     * @param dbType
     * @return
     */
    public CommentType getCommentType(int dbType){
        switch (dbType) {
            case 0 :
                return INDEX_COMMENT;
            case 1 :
                return MATERIAL_COMMENT;
            case 2 :
                return MICROBLOG_COMMENT;
            case 3 :
                return OTHER_COMMENT;
            default:
                return null;
        }
    }

    /**
     * 根据状态类型获取db状态
     * @param commentType
     * @return
     */
    public Integer getDbType(CommentType commentType){
        switch (commentType) {
            case INDEX_COMMENT:
                return 0;
            case MATERIAL_COMMENT:
                return 1;
            case MICROBLOG_COMMENT:
                return 2;
            case OTHER_COMMENT:
                return 3;
            default:
                return null;
        }
    }
}
