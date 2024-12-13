package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;

// 학생 저장소 역할을 추상화
public interface StudentRepository {

    // 학생 조회 기능
    Student findByStudentId(String studentId);
}
