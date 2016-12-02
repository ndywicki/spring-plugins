package com.github.ndywicki.plugins.one.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas Dywicki on 02/11/2016.
 */
@Component
@Profile("plugin-one")
@ConfigurationProperties(prefix = "plugin-one")
public class PluginOneProperties {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
