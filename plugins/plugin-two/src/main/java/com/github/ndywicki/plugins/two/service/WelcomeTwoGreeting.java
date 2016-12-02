package com.github.ndywicki.plugins.two.service;

import com.github.ndywicki.api.Greeting;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas Dywicki on 01/11/2016.
 */
@Component
public class WelcomeTwoGreeting implements Greeting {

    @Override
    public String getGreeting() {

        return "Welcome from plugin-two";
    }
}
