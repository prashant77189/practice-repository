package com.docker.test.docker.Config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@Component
public class AppConfig {

    @Bean
    @Primary
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
