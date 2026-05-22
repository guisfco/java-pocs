package com.guisfco;

import java.lang.reflect.Method;

public record RouteHandler(Object controller, Method method) {
}