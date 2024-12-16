package com.spring.core.chap04_2.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    // 사용자 정보를 조회
    public String getUserDetails(String username) {
        return "User: " + username + ", Role: COMMON";
    }

    // 관리자 작업 수행
    public void performAdminTask() {
        // ..  관리자가 수행할 코드
        System.out.println("관리자가 코드를 실행함!");
    }

}
