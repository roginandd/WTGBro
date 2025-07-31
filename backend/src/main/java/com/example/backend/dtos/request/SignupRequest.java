package com.example.backend.dtos.request;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;

    private String password;

    private String confirmPassword;

    private String email;
}
