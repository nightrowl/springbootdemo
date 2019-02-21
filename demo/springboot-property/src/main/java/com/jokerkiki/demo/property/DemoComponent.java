package com.jokerkiki.demo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 *
 * @author 70719
 *
 */
@Component
@ConfigurationProperties(prefix = "demo")
@Validated
public class DemoComponent {

    private String id ;
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
        return "DemoComponent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
