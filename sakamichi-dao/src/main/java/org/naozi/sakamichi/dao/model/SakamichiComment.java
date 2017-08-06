package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class SakamichiComment {
    private Long id;

    private Long from;

    private Long to;

    private Integer type;

    private String content;

    private Integer index;

    private Long parentId;

    private Date createTime;

    public SakamichiComment(Long id, Long from, Long to, Integer type, String content, Integer index, Long parentId, Date createTime) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.type = type;
        this.content = content;
        this.index = index;
        this.parentId = parentId;
        this.createTime = createTime;
    }

    public SakamichiComment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}