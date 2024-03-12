package com.pucelj.restapidemo.dto;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String grade;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Subject> subjects;
}
