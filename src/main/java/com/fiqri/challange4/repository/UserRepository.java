package com.fiqri.challange4.repository;

import com.fiqri.challange4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}