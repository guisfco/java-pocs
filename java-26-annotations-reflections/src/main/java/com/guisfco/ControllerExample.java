package com.guisfco;

import java.util.List;

public class ControllerExample {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(new User("Guilherme"), new User("Yasmin"));
    }

    @GetMapping("/users/1")
    public User getUser() {
        return new User("Guilherme");
    }

    @GetMapping(value = "/test", enabled = false)
    public void test() {
        IO.println("This is just a test.");
    }

    public void internalMethod() {
        IO.println("Random method not exposed.");
    }
}
