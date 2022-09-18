package com.truongvc.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truongvc.UserService.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
