package com.gis.student_game.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(generator = "cuid")
    @Column(nullable = false, updatable = false, columnDefinition = "text")
    private String id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String password;

}
