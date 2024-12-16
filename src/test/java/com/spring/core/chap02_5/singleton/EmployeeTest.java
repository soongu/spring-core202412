package com.spring.core.chap02_5.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void test() {
        Employee e1 = Employee.getInstance();
        Employee e2 = Employee.getInstance();

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
    }
}