package com.docker.exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DockerAPI {
    @GetMapping("/api/docker")
    public String getDockerInfo() {
        return "Hello, this is a Spring Boot application running inside a Docker container!";
    }
}
