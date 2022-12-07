package com.gonzaga.banksystemv2.model;

import com.gonzaga.banksystemv2.Enum.PersonType;

import java.io.Serializable;
import java.time.LocalDate;

/*
    personType utilizará ENUM,
    devido o fato de existirem somente 2 valores
    Pessoa Física PF e Pessoa Jurica PJ.
 */

public class Client implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private Integer phone;
    private Long addressId;
    private Integer document;
    private LocalDate birthdate;
    private PersonType personType;

}
