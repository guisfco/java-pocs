package com.guisfco;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) { // starts the Spring container
            var orderService = context.getBean(OrderService.class); // because Main is not managed by Spring
            orderService.createOrder();

            var orderService2 = context.getBean(OrderService.class); // just to compare if it's singleton
            IO.println("Singleton? " + (orderService == orderService2));
        }
    }
}
