package com.spring.core.chap04_2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    // UserService의 메서드 실행 전에 공통 로그를 찍을것
    @Around("execution(* com.spring.core.chap04_2.service.UserService.*(..))")
    public void logAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("UserService의 메서드 실행!!");

        joinPoint.proceed(); // 이 시점에서 핵심 로직 메서드가 호출

        System.out.println("UserService의 메서드 실행종료!!");
    }

    // 관리자 기능 실행 전에 관리자인지를 확인
    @Before("execution(* com.spring.core.chap04_2.service.UserService.performAdminTask(..))")
    public void checkUserAuth() {
        String currentUser = "common"; // db에서 권한조회 코드
        if (!currentUser.equals("admin")) {
            throw new SecurityException("접근 거부: 관리자 권한이 필요합니다.");
        }
    }
}
