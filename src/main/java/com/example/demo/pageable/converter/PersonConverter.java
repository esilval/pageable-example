package com.example.demo.pageable.converter;

import com.example.demo.pageable.dto.PersonDTO;
import com.example.demo.pageable.entity.Person;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class PersonConverter {

    private static PersonDTO fromEntity(final Person entity) {
        return PersonDTO.builder()
                .id(entity.getId())
                .documentType(entity.getDocumentType())
                .documentNumber(entity.getDocumentNumber())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .phoneNumber(entity.getPhoneNumber())
                .address(entity.getAddress())
                .email(entity.getEmail())
                .creationDate(entity.getCreationDate())
                .ipAddress(entity.getIpAddress())
                .build();
    }

    public static List<PersonDTO> fromEntities(final List<Person> entities) {
        return entities.stream().map(PersonConverter::fromEntity).collect(Collectors.toList());
    }
}
