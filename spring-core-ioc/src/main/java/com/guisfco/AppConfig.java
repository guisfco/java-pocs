package com.guisfco;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.guisfco") // tells the container where to search for annotated classes
public class AppConfig {

    @Bean
    public PaymentGatewayClient paymentGatewayClient() {
        return new PayPalClient();
    }
}