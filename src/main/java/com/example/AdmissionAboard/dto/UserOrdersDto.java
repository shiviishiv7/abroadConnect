package com.example.AdmissionAboard.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 * A DTO for the {@link com.example.AdmissionAboard.model.UserOrders} entity
 */
@Data
public class UserOrdersDto implements Serializable {
    private final Long userRequestId;
    private final Long userResponseId;
    private final Date date;
    private final Time time;
    private final String status;
}