package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.SakamichiArticle;
import org.naozi.sakamichi.dao.model.SakamichiArticleExample;

public interface SakamichiArticleMapper {
    int countByExample(SakamichiArticleExample example);

    int deleteByExample(SakamichiArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SakamichiArticle record);

    int insertSelective(SakamichiArticle record);

    List<SakamichiArticle> selectByExampleWithBLOBs(SakamichiArticleExample example);

    List<SakamichiArticle> selectByExample(SakamichiArticleExample example);

    SakamichiArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SakamichiArticle record, @Param("example") SakamichiArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") SakamichiArticle record, @Param("example") SakamichiArticleExample example);

    int updateByExample(@Param("record") SakamichiArticle record, @Param("example") SakamichiArticleExample example);

    int updateByPrimaryKeySelective(SakamichiArticle record);

    int updateByPrimaryKeyWithBLOBs(SakamichiArticle record);

    int updateByPrimaryKey(SakamichiArticle record);
}