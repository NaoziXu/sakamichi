package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class Microblog {
    private Long id;

    private String content;

    private String pic;

    private String music;

    private Date createTime;

    private Date updateTime;

    private Integer hit;

    private Boolean available;

    public Microblog(Long id, String content, String pic, String music, Date createTime, Date updateTime, Integer hit, Boolean available) {
        this.id = id;
        this.content = content;
        this.pic = pic;
        this.music = music;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.hit = hit;
        this.available = available;
    }

    public Microblog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music == null ? null : music.trim();
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

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}