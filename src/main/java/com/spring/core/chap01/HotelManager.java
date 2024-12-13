package com.spring.core.chap01;

// 호텔 운영에 필요한 의존객체들(셰프, 레스토랑, 음식코스..)
// 을 대리해서 생성해서 외부에서 주입해주는 역할
public class HotelManager {

    // 셰프를 구하는 기능 (셰프 객체의 생성을 일임)
    public Chef chef() {
        return new JannChef();
    }
    // 코스를 개발하는 기능
    public Course course() {
        return new FrenchCourse();
    }
    // 레스토랑 입점을 담당하는 기능
    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), course());
    }
    // 호텔에게 의존객체를 전달하는 기능
    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }


}
