package com.devbc.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
//@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

    @Column(name = "f_name", length = 35)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = true)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

//    @Column(updatable = false, nullable = false)
//    private LocalDateTime createdAt;
//
//    @Column(insertable = false)
//    private LocalDateTime lastModified;
}
