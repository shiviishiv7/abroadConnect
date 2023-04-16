package com.example.AdmissionAboard.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.Profile} entity
 */
@Data
public class ProfileDto implements Serializable {
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String firstName;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")

    private final String lastName;
    private final Long universityId;
    private final Long userId;
}