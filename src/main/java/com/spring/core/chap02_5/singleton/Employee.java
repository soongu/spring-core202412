package com.spring.core.chap02_5.singleton;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Employee {
    private Long id;     // 사번
    private String name; // 이름

    // 싱글톤 패턴 : 특정 클래스의 객체는 오로지 단 하나임을 보장
    // 1. 외부에서 객체의 생성을 제한
    //    - 생성자를 전부 없애서 객체생성을 못하게 함
    private Employee() {}

    // 2. 단 하나의 객체를 스스로 생성함
    private static Employee employee = new Employee();

    // 3. 외부에서 객체 생성을 요구할 경우
    //    미리 만들어둔 단 하나의 객체를 제공
    public static Employee getInstance() {
        return employee;
    }
}
