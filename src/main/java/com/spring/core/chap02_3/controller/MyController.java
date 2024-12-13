package com.spring.core.chap02_3.controller;

import com.spring.core.chap02_3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// service에서 정제한 데이터를 클라이언트에게 보내주는 역할
@Component
public class MyController {

    private MyService service;

    // 자동으로 스프링이 관리하는 빈을 탐색하여 자동주입하겠다.
    @Autowired
    public MyController(MyService service) {
        System.out.println("MyController 객체 생성!");
        this.service = service;
    }

    public void handleRequest() {
        String data = service.processData();
        System.out.println("정제된 데이터를 응답 -> " + data);
    }
}
