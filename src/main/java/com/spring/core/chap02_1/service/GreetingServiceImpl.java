package com.spring.core.chap02_1.service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
//        return String.format("Hello, %s!", name);
        return "Hello, %s!".formatted(name); // Java 15 이후
    }
}
