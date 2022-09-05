package com.kodedge.springdemoapplication;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findDistinctFirstNameByFirstName(String firstName);
    List<Person> findPersonByFirstNameOrderById(String firstName);
    List<Person> findPersonByAddressZipCode(int zipCode);
    List<Person> findPersonByFirstName(String firstName, Sort sort);

}
