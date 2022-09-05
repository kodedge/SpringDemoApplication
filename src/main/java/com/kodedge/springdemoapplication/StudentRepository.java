package com.kodedge.springdemoapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="data")
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
