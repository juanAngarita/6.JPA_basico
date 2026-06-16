package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

import lombok.extern.java.Log;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
