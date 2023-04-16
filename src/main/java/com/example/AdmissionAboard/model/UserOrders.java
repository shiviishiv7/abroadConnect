package com.example.AdmissionAboard.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data

public class UserOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long userRequestId;
    private Long userResponseId;
    private Date date;
    private Time time;
    private String status;

}
