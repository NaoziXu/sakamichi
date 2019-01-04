package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class Comment {
    private Long id;

    private Long guestId;

    private Long materialId;

    private String content;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Boolean reedit;

    private Boolean available;

    public Comment(Long id, Long guestId, Long materialId, String content, Integer type, Date createTime, Date updateTime, Boolean reedit, Boolean available) {
        this.id = id;
        this.guestId = guestId;
        this.materialId = materialId;
        this.content = content;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.reedit = reedit;
        this.available = available;
    }

    public Comment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Boolean getReedit() {
        return reedit;
    }

    public void setReedit(Boolean reedit) {
        this.reedit = reedit;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}