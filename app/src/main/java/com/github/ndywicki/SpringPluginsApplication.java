package com.github.ndywicki;

import com.github.ndywicki.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ ApplicationProperties.class })
@Slf4j
public class SpringPluginsApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringPluginsApplication.class, args);
	}

}
