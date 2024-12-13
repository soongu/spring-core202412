package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Component;

// 학생 정보를 메모리에서 조회
@Component("memRepo")
public class StudentMemoryRepository implements StudentRepository {

    @Override
    public Student findByStudentId(String studentId) {
        System.out.println("메모리에서 학생을 조회합니다.");
        return new Student("001", "김철수", "F");
    }
}
