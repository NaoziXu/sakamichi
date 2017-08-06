package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.SakamichiComment;
import org.naozi.sakamichi.dao.model.SakamichiCommentExample;

public interface SakamichiCommentMapper {
    int countByExample(SakamichiCommentExample example);

    int deleteByExample(SakamichiCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SakamichiComment record);

    int insertSelective(SakamichiComment record);

    List<SakamichiComment> selectByExample(SakamichiCommentExample example);

    SakamichiComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SakamichiComment record, @Param("example") SakamichiCommentExample example);

    int updateByExample(@Param("record") SakamichiComment record, @Param("example") SakamichiCommentExample example);

    int updateByPrimaryKeySelective(SakamichiComment record);

    int updateByPrimaryKey(SakamichiComment record);
}