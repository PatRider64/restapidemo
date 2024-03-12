package com.pucelj.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucelj.restapidemo.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
