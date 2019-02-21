package com.jokerkiki.demo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoProperty {

    @Value("${demo.id}")
    private String id ;

    @Value("${demo.name}")
    private String name ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoProperty{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
