package com.example.AdmissionAboard.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.Location} entity
 */
@Data
public class LocationDto implements Serializable {

    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 200, message = "{validation.name.size.too_long}")

    private final String address1;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private final String address2;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 6, message = "{validation.name.size.too_long}")
    private final String postalCode;

    @Pattern(regexp = "^\\d{12}$")
    private final String phoneNumber;

    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String cityName;

    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String stateName;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private final String country;
}