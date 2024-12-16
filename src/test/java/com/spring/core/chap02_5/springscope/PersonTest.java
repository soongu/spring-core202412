package com.spring.core.chap02_5.springscope;

import com.spring.core.SpringCore202412Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class PersonTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringCore202412Application.class);

        Cook p1 = context.getBean(Cook.class);
        Cook p2 = context.getBean(Cook.class);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }

}