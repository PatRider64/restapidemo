package com.pucelj.restapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucelj.restapidemo.dto.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
