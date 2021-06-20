package com.example.twitterclone.config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import reactor.core.scheduler.Schedulers;

import java.util.concurrent.Executors;

public class Scheduler implements reactor.core.scheduler.Scheduler {
    private Integer connectionPoolSize;

    public DbConfig(@Value("${spring.datasource.maximum-pool-size:10}") Integer connectionPoolSize) {
        this.connectionPoolSize = connectionPoolSize;
    }

    @Bean
    public Scheduler dbScheduler() {
        return Schedulers.fromExecutor(Executors.newFixedThreadPool(connectionPoolSize));
    }
}
