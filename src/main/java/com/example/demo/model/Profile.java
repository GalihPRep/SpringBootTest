package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "profile")
@Data
public class Profile {
    @Id @GeneratedValue
    Long id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String LastName;
    @Column
    Float address;
    @Column
    Date birthday;
    @Column
    String email;
    @Column
    String city;
    @Column
    String country;
}
