package com.spring.core.chap02_3.practice.q1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Setter @Getter @ToString
public class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("사람이 생성됨!!");
    }
}
