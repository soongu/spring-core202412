package com.spring.core.chap02_2.practice.q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicConfig {

    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer player = new MusicPlayer();
        player.setSpeaker(new Speaker());
        return player;
    }
}
