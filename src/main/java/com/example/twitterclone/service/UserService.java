package com.example.twitterclone.service;

import com.example.twitterclone.config.Scheduler;
import com.example.twitterclone.model.User;
import com.example.twitterclone.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Scheduler dbScheduler;
    public Mono<User> getUserByScreenName(String screenName) {
        return Mono.fromCallable(() ->
        userRepository.findById(Long.parseLong(screenName))).publishOn(dbScheduler);
    }
}
