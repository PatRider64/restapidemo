package com.pucelj.restapidemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucelj.restapidemo.dto.Subject;
import com.pucelj.restapidemo.repository.SubjectRepository;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @SuppressWarnings("null")
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Subject> findById(Long id) {
        return subjectRepository.findById(id);
    }

    @SuppressWarnings("null")
    public void deleteById(Long id) {
        subjectRepository.deleteById(id);
    }
}
