package com.example.twitterclone.controller;

import com.example.twitterclone.model.User;
import com.example.twitterclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{screenName}")
    public Mono<User> getUserByScreenName(@PathVariable String screenName){
        return userService.getUserByScreenName(screenName);
    }
}
