package com.pucelj.restapidemo.dto;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String instructions;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
}
