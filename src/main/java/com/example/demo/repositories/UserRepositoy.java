package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
