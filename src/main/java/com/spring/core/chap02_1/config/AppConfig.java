package com.spring.core.chap02_1.config;

import com.spring.core.chap02_1.service.GreetingService;
import com.spring.core.chap02_1.service.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 이 클래스는 일반 클래스가 아니라 스프링에게 관리할 객체를 알려주는
// 설정 클래스
@Configuration
public class AppConfig {

    // 어떤 객체를 관리할지 메서드로 설정
    @Bean
    public GreetingService greetingService() {
        System.out.println("greeting객체를 생성함!");
        return new GreetingServiceImpl();
    }
}
