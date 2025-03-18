package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcrud.model.Employee;

public interface BhoomiEmployeeRepository extends JpaRepository<Employee, Long> {

}
