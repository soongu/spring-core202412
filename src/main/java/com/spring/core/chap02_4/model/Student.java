package com.spring.core.chap02_4.model;

import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student {

    private String studentId;
    private String name;
    private String grade;
}
