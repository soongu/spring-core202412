package com.spring.core.chap02_2.practice.q2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    @Test
    void test() {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(MusicConfig.class);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
    }

}