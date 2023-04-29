package com.example.eurica_phone_book_client.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "phone_number")
@Data
public class PhoneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String fullName;

    @Column(name = "number")
    private String phoneNum;


}
