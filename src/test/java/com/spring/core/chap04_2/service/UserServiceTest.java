package com.spring.core.chap04_2.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void userDetailTest() {
        String name = userService.getUserDetails("김철수");
        System.out.println("name = " + name);
    }
    @Test
    void adminTest() {
        userService.performAdminTask();
    }
}