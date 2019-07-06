package com.infopulse.messaging.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {
    @NotNull(message = "Name is required")
    private String name;
    @NotNull(message = "Login is required")
    private String login;
    @NotNull(message = "Password is required")
    private String password;
}
