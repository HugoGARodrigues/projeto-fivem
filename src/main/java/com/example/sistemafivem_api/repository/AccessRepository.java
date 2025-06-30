package com.example.sistemafivem_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemafivem_api.entity.Access;

public interface AccessRepository extends JpaRepository<Access, Long> {

    Optional<Access> findByUserId(Integer userId);
    Optional<Access> findByEmail(String email);
}
