package com.example.demo.pageable.service;

import com.example.demo.pageable.converter.PersonConverter;
import com.example.demo.pageable.dto.PersonDTO;
import com.example.demo.pageable.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository repository;

    public List<PersonDTO> paginate(int size, int page) {
        log.info("Retrieve info for page {} and size {}", page, size);
        final Pageable pageable = PageRequest.of(page, size);
        return PersonConverter.fromEntities(repository.findAll(pageable).getContent());
    }
}
