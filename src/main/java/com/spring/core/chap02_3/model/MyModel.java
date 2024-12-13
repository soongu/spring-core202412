package com.spring.core.chap02_3.model;

import lombok.*;

// 데이터베이스로부터 가져온 데이터라고 가정
@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MyModel {
    private String data;
}
