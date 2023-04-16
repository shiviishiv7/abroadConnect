package com.example.AdmissionAboard.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.Branch} entity
 */
@Data
public class BranchDto implements Serializable {

    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private final String name;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 200, message = "{validation.name.size.too_long}")
    private final String description;
    @Size(min = 2, message = "{validation.name.size.too_short}")
    @Size(max = 10, message = "{validation.name.size.too_long}")
    private final String fee;
    private final Long departmentId;
}