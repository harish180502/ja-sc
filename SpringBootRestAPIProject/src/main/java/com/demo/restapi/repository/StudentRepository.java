package com.demo.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
