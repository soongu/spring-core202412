package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotel() {
//        Hotel hotel = new Hotel();

        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();

        hotel.reserve();
    }
}