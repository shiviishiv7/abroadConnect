package com.example.AdmissionAboard.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.Payment} entity
 */
@Data
public class PaymentDto implements Serializable {
    private final Double amount;
    private final Long userRequestId;
}