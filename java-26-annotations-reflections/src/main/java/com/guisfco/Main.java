package com.guisfco;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    static void main() throws InvocationTargetException, IllegalAccessException {
        var person = new User("Guilherme");
        var methods = person.getClass().getDeclaredMethods();

        IO.println("==== Invoking annotated methods ====");

        // Loop to get the annotated methods
        for (Method method : methods) {
            var annotation = method.getAnnotation(SpecialAnnotation.class);

            if (annotation != null) {
                IO.println("Method: " + method.getName());
                method.invoke(person); // That's not the main purpose
            }
        }

        IO.println("\n==== Controller example ====");

        var router = new Router();

        // Registering routes
        router.registerRoutes(new ControllerExample());

        // Executing calls
        router.execute(new Request("/hello")).ifPresent(IO::println);
        router.execute(new Request("/users")).ifPresent(IO::println);
        router.execute(new Request("/users/1")).ifPresent(IO::println);
        router.execute(new Request("/users/search")).ifPresent(IO::println);
    }
}
