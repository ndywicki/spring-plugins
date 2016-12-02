package com.github.ndywicki.plugins.two;

import com.github.ndywicki.plugins.two.config.PluginTwoProperties;
import com.github.ndywicki.plugins.two.service.WelcomeTwoGreeting;
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
@Profile("plugin-two")
@EnableConfigurationProperties({ PluginTwoProperties.class })
public class PluginTwoListener {

    @Value("${plugin-two.id}")
    private String id;

    @Value("${application.name}")
    private String applicationName;

    @Inject
    private PluginTwoProperties pluginTwoProperties;

    @Inject
    private WelcomeTwoGreeting welcomeGreeting;

    @EventListener
    public void handleApplicationReadyEvent(ApplicationReadyEvent event) throws ParseException {
        log.info("New event:{} ", event);
        log.info("Injected application parent name:{} values id:{} from pluginTwoProperties id:{}",
            applicationName, id, pluginTwoProperties.getId());
        log.info(welcomeGreeting.getGreeting());
    }
}
