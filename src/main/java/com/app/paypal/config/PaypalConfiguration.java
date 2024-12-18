package com.app.paypal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.base.rest.APIContext;

@Configuration
public class PaypalConfiguration {
    
    @Bean
    public APIContext apiContext(
        @Value("#{paypal.clientId}") String clientId,
        @Value("#{paypal.clientSecret}") String clientSecret,
        @Value("#{paypal.mode}") String environment
    ) {
        return new APIContext(clientId, clientSecret, environment);
    }
}
