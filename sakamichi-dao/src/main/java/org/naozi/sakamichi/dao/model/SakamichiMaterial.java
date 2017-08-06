package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class SakamichiMaterial {
    private Long id;

    private String name;

    private Integer type;

    private String url;

    private Date createTime;

    private Date updateTime;

    private String content;

    public SakamichiMaterial(Long id, String name, Integer type, String url, Date createTime, Date updateTime, String content) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.url = url;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.content = content;
    }

    public SakamichiMaterial() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}