package com.example.demo.pageable.repository;

import com.example.demo.pageable.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
