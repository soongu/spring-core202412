package com.spring.core.chap02_3.config;

import com.spring.core.chap02_3.controller.MyController;
import com.spring.core.chap02_3.repository.MyRepository;
import com.spring.core.chap02_3.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.chap02_3")
public class ModelConfig {

    // 빈 등록(빈 정의) : 스프링이 관리할 객체들을 지정

//    @Bean
//    public MyRepository repository() {
//        return new MyRepository();
//    }

//    @Bean
//    public MyService service() {
//        return new MyService(repository());
//    }

//    @Bean
//    public MyController controller() {
//        return new MyController(service());
//    }
}
