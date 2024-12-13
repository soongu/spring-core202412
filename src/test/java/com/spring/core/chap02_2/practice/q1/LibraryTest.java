package com.spring.core.chap02_2.practice.q1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean(Library.class);
        library.listBooks();
    }
}