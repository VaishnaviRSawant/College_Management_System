package com.example.college.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Subject> subjects;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students;
}
