package com.github.ndywicki.plugins.one.service;

import com.github.ndywicki.api.Greeting;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas Dywicki on 01/11/2016.
 */
@Component
public class WelcomeOneGreeting implements Greeting {

    @Override
    public String getGreeting() {

        return "Welcome from plugin-one";
    }
}
