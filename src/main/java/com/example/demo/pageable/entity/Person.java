package com.example.demo.pageable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

}
