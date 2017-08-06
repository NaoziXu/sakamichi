package org.naozi.sakamichi.dao.model;

import java.util.Date;

public class SakamichiUser {
    private Long id;

    private String name;

    private String email;

    private Integer type;

    private String password;

    private Date createTime;

    public SakamichiUser(Long id, String name, String email, Integer type, String password, Date createTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.password = password;
        this.createTime = createTime;
    }

    public SakamichiUser() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}