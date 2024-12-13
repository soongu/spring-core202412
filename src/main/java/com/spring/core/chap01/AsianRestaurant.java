package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant {

    // 전문 셰프
    private Chef chef;
    // 코스 메뉴
    private Course course;

    public AsianRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
