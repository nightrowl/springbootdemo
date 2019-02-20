package com.jokerkiki.demo.entity;

/**
 * 测试对象
 * @author 70719
 */
public class Demo {
    private String name ;
    private String content;
    private Long id ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", id=" + id +
                '}';
    }
}
