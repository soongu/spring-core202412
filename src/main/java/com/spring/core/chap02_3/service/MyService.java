package com.spring.core.chap02_3.service;

import com.spring.core.chap02_3.model.MyModel;
import com.spring.core.chap02_3.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 데이터베이스 가져온 데이터를 정제하는 역할
@Component
public class MyService {

    private MyRepository repository;

    @Autowired
    public MyService(MyRepository repository) {
        System.out.println("MyService 객체 생성!");
        this.repository = repository;
    }

    public String processData() {
        MyModel data = repository.findData();
        return "데이터를 전처리 -> " + data;
    }

}
