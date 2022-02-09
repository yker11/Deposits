package com.MsDeposits.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@Document(collation = "Deposits")
public class Deposits {

    @Id
    private String id;
    private int deposit;
    private Date fecha;

}