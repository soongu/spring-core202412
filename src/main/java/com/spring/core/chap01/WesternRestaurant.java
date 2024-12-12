package com.spring.core.chap01;

public class WesternRestaurant {

    private JannChef chef;
    private FrenchCourse course;

    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
