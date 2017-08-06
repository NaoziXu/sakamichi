package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class SakamichiArticle {
    private Long id;

    private String coverMaterialIds;

    private Long contentMaterialId;

    private Integer type;

    private Long tagIds;

    private Date createTime;

    private Date updateTime;

    private Boolean isAvailable;

    private String overview;

    public SakamichiArticle(Long id, String coverMaterialIds, Long contentMaterialId, Integer type, Long tagIds, Date createTime, Date updateTime, Boolean isAvailable, String overview) {
        this.id = id;
        this.coverMaterialIds = coverMaterialIds;
        this.contentMaterialId = contentMaterialId;
        this.type = type;
        this.tagIds = tagIds;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isAvailable = isAvailable;
        this.overview = overview;
    }

    public SakamichiArticle() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoverMaterialIds() {
        return coverMaterialIds;
    }

    public void setCoverMaterialIds(String coverMaterialIds) {
        this.coverMaterialIds = coverMaterialIds == null ? null : coverMaterialIds.trim();
    }

    public Long getContentMaterialId() {
        return contentMaterialId;
    }

    public void setContentMaterialId(Long contentMaterialId) {
        this.contentMaterialId = contentMaterialId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getTagIds() {
        return tagIds;
    }

    public void setTagIds(Long tagIds) {
        this.tagIds = tagIds;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }
}