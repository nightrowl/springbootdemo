package com.jokerkiki.demo.entity;

import java.util.Date;

public class Baike {
    private String id ;
    private String desc;
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Baike{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
