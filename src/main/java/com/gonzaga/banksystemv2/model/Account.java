package com.gonzaga.banksystemv2.model;

import com.gonzaga.banksystemv2.Enum.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account implements Serializable {

    private Long id;
    private Long number;
    private Long clientId;
    private Double balance;
    private Integer password;
    private AccountType accountType;
    private LocalDateTime dateActivation;
    private LocalDateTime dateDeactivation;


}
