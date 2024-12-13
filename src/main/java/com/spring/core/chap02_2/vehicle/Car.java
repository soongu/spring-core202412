package com.spring.core.chap02_2.vehicle;

public class Car {

    //의존 객체 설정
    private final Engine engine;

    // 생성자 주입 - 생성자를 통해 의존객체를 전달받음
    public Car(Engine engine) {
        this.engine = engine;
    }
//
//    public Car() {
//    }
   // setter 주입 - setter를 통해 의존객체를 전달받음
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public void startEngine() {
        engine.start();
        System.out.println("자동차가 달릴 준비가 완료되었습니다.");
    }
}
