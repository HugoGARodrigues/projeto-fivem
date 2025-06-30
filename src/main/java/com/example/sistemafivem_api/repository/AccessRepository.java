package com.example.sistemafivem_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemafivem_api.entity.Access;

public interface AccessRepository extends JpaRepository<Access, Long> {

    Access findByUserId(Integer userId);
}
