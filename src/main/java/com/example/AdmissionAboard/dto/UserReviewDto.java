package com.example.AdmissionAboard.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.UserReview} entity
 */
@Data
public class UserReviewDto implements Serializable {
    @Size(min = 12, message = "{validation.name.size.too_short}")
    @Size(max = 12, message = "{validation.name.size.too_long}")

    private final String comment;

//    @Pattern(regexp = "^\\d{5}$")
    private final int rating;
    private final Long userId;
}