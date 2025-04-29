package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.model.Profile;
import com.example.studentcrud.model.Staff;

public interface ProfileRepository extends JpaRepository<Staff, Long> {

    void save(Profile pro);
}
