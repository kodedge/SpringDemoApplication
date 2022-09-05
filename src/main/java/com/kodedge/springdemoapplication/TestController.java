package com.kodedge.springdemoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/person/{firstName}")
    List<Person> getData(@PathVariable String firstName){
        Sort sort =  Sort.by("Id").descending().and(Sort.by("lastName").descending());
        return personRepository.findPersonByFirstName(firstName,sort);
    }
}
