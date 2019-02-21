package com.jokerkiki.demo.entity;

/**
 *
 * demo实体配置类
 */
public class DemoConfig {
    private Long id ;
    private String config;
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
