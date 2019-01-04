package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class Guest {
    private Long id;

    private Integer type;

    private String name;

    private String picPath;

    private Date createTime;

    private Date updateTime;

    private Boolean available;

    public Guest(Long id, Integer type, String name, String picPath, Date createTime, Date updateTime, Boolean available) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.picPath = picPath;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.available = available;
    }

    public Guest() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
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