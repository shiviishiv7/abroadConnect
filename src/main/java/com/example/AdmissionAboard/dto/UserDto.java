package com.example.AdmissionAboard.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.User} entity
 */
@Data
public class UserDto implements Serializable {

    @Email(message = "Enter a valida email")
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String email;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String password;
    private final int userType;
}