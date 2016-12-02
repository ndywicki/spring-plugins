package com.github.ndywicki.plugins.one;

import com.github.ndywicki.plugins.one.config.PluginOneProperties;
import com.github.ndywicki.plugins.one.service.WelcomeOneGreeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.text.ParseException;

/**
 * Created by Nicolas Dywicki on 01/11/2016.
 */
@Component
@Slf4j
@Profile("plugin-one")
@EnableConfigurationProperties({ PluginOneProperties.class })
public class PluginOneListener {

    @Value("${plugin-one.id}")
    private String id;

    @Value("${application.name}")
    private String applicationName;

    @Inject
    private PluginOneProperties pluginOneProperties;

    @Inject
    private WelcomeOneGreeting welcomeGreeting;

    @EventListener
    public void handleApplicationReadyEvent(ApplicationReadyEvent event) throws ParseException {
        log.info("New event:{} ", event);
        log.info("Injected application parent name:{} values id:{} from pluginOneProperties id:{}", applicationName, id, pluginOneProperties.getId());
        log.info(welcomeGreeting.getGreeting());
    }
}
