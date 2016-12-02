package com.github.ndywicki.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Nicolas Dywicki on 02/11/2016.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private String name = "default-name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
