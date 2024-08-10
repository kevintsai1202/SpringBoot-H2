package com.kt.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kt.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
