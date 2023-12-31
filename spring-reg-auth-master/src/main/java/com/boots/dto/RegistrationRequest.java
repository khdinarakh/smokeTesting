package com.boots.dto;


import org.springframework.stereotype.Component;

@Component
public class RegistrationRequest {
    private String username;
    private String password;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

