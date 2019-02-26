package com.jokerkiki.demo.entity;



import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * demo实体配置类
 */
@Entity
@Table(name="s_config")
public class DemoConfig  implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id ;
    @Column(name = "config")
    private String config;
    @Column(name = "configValue")
    private String configValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Override
    public String toString() {
        return "DemoConfig{" +
                "id=" + id +
                ", config='" + config + '\'' +
                ", configValue='" + configValue + '\'' +
                '}';
    }
}
