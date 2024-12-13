package com.spring.core.chap02_2.practice.q1;

import lombok.*;

//@Data
@Setter
@Getter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 초기화 생성자
@ToString
@EqualsAndHashCode
public class Book {
    private String title;
    private String author;

    // 기본생성자
    // 모든필드 초기화 생성자
    // setter getter
    // toString, equals, hashcode
}
