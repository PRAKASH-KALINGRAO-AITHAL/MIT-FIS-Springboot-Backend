package com.pka.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pka.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
