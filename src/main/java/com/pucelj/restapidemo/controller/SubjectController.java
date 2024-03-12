package com.pucelj.restapidemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucelj.restapidemo.dto.Subject;
import com.pucelj.restapidemo.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("")
    public Subject create(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @GetMapping("")
    public java.util.List<Subject> findAll() {
        return subjectService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Subject> findById(@PathVariable Long id) {
        return subjectService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        subjectService.deleteById(id);
        return id;
    }
}
