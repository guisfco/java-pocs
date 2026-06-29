package com.guisfco;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            var orderService = context.getBean(OrderService.class); // because Main is not managed by Spring
            orderService.createOrder();
        }
    }
}
