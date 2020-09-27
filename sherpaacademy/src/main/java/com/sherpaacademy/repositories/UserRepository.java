package com.sherpaacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sherpaacademy.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
