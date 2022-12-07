package com.gonzaga.banksystemv2.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Account implements Serializable {

    private Integer id;
    private Integer number;
    private Integer balance;
    private Integer password;
    private Integer clientId;
    private Enum accountType;
    private LocalDate dateActivation;
    private LocalDate dateDeactivation;


}
