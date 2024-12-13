package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentDatabaseRepository;
import com.spring.core.chap02_4.repository.StudentMemoryRepository;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 저장소에서 조회한 학생 정보를 출력
@Component
public class StudentController {

    private StudentRepository repository;

    // 생성자 주입을 사용할 때 생성자가 딱 한개만 존재하면
    // @Autowired를 생략할 수 있음
//    @Autowired
    public StudentController(@Qualifier("memRepo") StudentRepository repository) {
        System.out.println("생성자 주입!");
        this.repository = repository;
    }

//    @Autowired
//    public void setRepository(StudentRepository repository) {
//        System.out.println("세터 주입!");
//        this.repository = repository;
//    }

    public void printStudentInfo() {
        Student student = repository.findByStudentId("ID");
        System.out.println("student = " + student);
    }
}
