package com.github.ndywicki;

import com.github.ndywicki.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by Nicolas Dywicki on 01/11/2016.
 */
@Component
@Slf4j
public class AppListener  implements ApplicationListener<ApplicationReadyEvent> {

    @Inject
    private ApplicationProperties applicationProperties;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("New event:{} application properties:{}", event, applicationProperties.getName());
    }
}
