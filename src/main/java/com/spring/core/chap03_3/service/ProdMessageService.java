package com.spring.core.chap03_3.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "이것은 운영환경에서 사용하는 서비스입니다.";
    }
}
