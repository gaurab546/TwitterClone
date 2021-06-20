package com.example.twitterclone.repo;

import com.example.twitterclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, long> {
    User findByUserName(String username);
}
