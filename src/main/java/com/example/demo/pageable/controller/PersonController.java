package com.example.demo.pageable.controller;

import com.example.demo.pageable.dto.PersonDTO;
import com.example.demo.pageable.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService service;

    @GetMapping("/search")
    public ResponseEntity<List<PersonDTO>> search(
            @RequestParam(value = "page") @NotNull int page, @RequestParam(value = "size") @NotNull int size) {
        return ResponseEntity.ok(service.paginate(size, page));
    }
}
