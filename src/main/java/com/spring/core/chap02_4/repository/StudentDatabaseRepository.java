package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Component;

// 학생 정보를 데이터베이스에서 조회
@Component("dbRepo")
public class StudentDatabaseRepository implements StudentRepository {

    @Override
    public Student findByStudentId(String studentId) {
        System.out.println("데이터베이스에서 학생을 조회합니다.");
        return new Student("002", "박영희", "A");
    }
}
