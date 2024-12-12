package com.spring.core.chap01;

public class WesternRestaurant implements Restaurant {

    private Chef chef = new JannChef();
    private Course course = new FrenchCourse();

    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
