package com.devbc.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.net.Inet4Address;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "resource_type") //Only with Single table strategy
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
