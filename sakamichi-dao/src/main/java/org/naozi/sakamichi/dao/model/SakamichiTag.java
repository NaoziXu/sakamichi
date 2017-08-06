package org.naozi.sakamichi.dao.model;

public class SakamichiTag {
    private Long id;

    private Integer type;

    private String name;

    public SakamichiTag(Long id, Integer type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public SakamichiTag() {
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
}