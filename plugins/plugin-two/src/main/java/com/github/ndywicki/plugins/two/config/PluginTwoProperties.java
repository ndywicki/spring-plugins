package com.github.ndywicki.plugins.two.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas Dywicki on 02/11/2016.
 */
@Component
@Configuration
@Profile("plugin-two")
@ConfigurationProperties(prefix = "plugin-two")
public class PluginTwoProperties {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
