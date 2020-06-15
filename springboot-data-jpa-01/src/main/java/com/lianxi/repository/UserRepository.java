package com.lianxi.repository;


import com.lianxi.entity.User01;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User01,Integer> {
}
