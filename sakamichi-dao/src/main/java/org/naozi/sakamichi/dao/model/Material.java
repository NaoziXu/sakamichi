package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class Material {
    private Long id;

    private Integer type;

    private String title;

    private String cover;

    private String remark;

    private String url;

    private String path;

    private Integer hit;

    private Date createTime;

    private Date updateTime;

    private Boolean available;

    public Material(Long id, Integer type, String title, String cover, String remark, String url, String path, Integer hit, Date createTime, Date updateTime, Boolean available) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.cover = cover;
        this.remark = remark;
        this.url = url;
        this.path = path;
        this.hit = hit;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.available = available;
    }

    public Material() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
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

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}