package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.SakamichiTag;
import org.naozi.sakamichi.dao.model.SakamichiTagExample;

public interface SakamichiTagMapper {
    int countByExample(SakamichiTagExample example);

    int deleteByExample(SakamichiTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SakamichiTag record);

    int insertSelective(SakamichiTag record);

    List<SakamichiTag> selectByExample(SakamichiTagExample example);

    SakamichiTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SakamichiTag record, @Param("example") SakamichiTagExample example);

    int updateByExample(@Param("record") SakamichiTag record, @Param("example") SakamichiTagExample example);

    int updateByPrimaryKeySelective(SakamichiTag record);

    int updateByPrimaryKey(SakamichiTag record);
}