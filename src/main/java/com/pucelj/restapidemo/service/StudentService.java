package com.pucelj.restapidemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucelj.restapidemo.dto.Student;
import com.pucelj.restapidemo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @SuppressWarnings("null")
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @SuppressWarnings("null")
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
