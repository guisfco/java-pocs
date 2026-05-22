package com.guisfco;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Router {

    private final Map<String, RouteHandler> routes;

    public Router() {
        this.routes = new HashMap<>();
    }

    public void registerRoutes(Object controller) {
        var controllerClass = controller.getClass();
        var controllerMethods = controllerClass.getDeclaredMethods();

        for (Method method : controllerMethods) {
            var annotation = method.getAnnotation(GetMapping.class);

            if (annotation != null) {
                if (annotation.enabled()) {
                    routes.putIfAbsent(annotation.value(), new RouteHandler(controller, method));
                }
            }
        }
    }

    public Optional<Object> execute(Request request) {
        var handler = routes.get(request.path());

        if (handler == null || request.body() != null && handler.method().getParameterCount() != request.body().length) {
            throw new RuntimeException("[404] Not Found: " + request.path());
        }

        try {
            return Optional.of(handler.method().invoke(handler.controller(), request.body()));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
