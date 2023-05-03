package com.example.MyProject.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername (String username);
}
