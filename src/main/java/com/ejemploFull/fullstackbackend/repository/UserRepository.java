package com.ejemploFull.fullstackbackend.repository;

import com.ejemploFull.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
