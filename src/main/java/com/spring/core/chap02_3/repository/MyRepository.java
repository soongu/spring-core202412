package com.spring.core.chap02_3.repository;

import com.spring.core.chap02_3.model.MyModel;
import org.springframework.stereotype.Component;

// 데이터베이스에 접근하여 데이터를 조회,수정,삭제,생성 하는 역할

// 스프링이 관리할 빈으로 자동 등록하겠다.
@Component
public class MyRepository {

    public MyRepository() {
        System.out.println("MyRepository 객체 생성!");
    }

    // 조회 기능
    public MyModel findData() {
        return new MyModel("DB에서 가져온 데이터입니다~");
    }
}
