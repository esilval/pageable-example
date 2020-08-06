package com.example.demo.pageable.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {

    private Integer id;

    private String documentType;

    private String documentNumber;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;

    private String email;

    private LocalDateTime creationDate;

    private String ipAddress;

}
