package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.SakamichiMaterial;
import org.naozi.sakamichi.dao.model.SakamichiMaterialExample;

public interface SakamichiMaterialMapper {
    int countByExample(SakamichiMaterialExample example);

    int deleteByExample(SakamichiMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SakamichiMaterial record);

    int insertSelective(SakamichiMaterial record);

    List<SakamichiMaterial> selectByExampleWithBLOBs(SakamichiMaterialExample example);

    List<SakamichiMaterial> selectByExample(SakamichiMaterialExample example);

    SakamichiMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SakamichiMaterial record, @Param("example") SakamichiMaterialExample example);

    int updateByExampleWithBLOBs(@Param("record") SakamichiMaterial record, @Param("example") SakamichiMaterialExample example);

    int updateByExample(@Param("record") SakamichiMaterial record, @Param("example") SakamichiMaterialExample example);

    int updateByPrimaryKeySelective(SakamichiMaterial record);

    int updateByPrimaryKeyWithBLOBs(SakamichiMaterial record);

    int updateByPrimaryKey(SakamichiMaterial record);
}