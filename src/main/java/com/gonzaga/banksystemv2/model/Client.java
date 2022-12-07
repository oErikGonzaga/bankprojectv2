package com.gonzaga.banksystemv2.model;

import java.io.Serializable;
import java.util.Date;

/*
    typePerson utilizará ENUM,
    devido o fato de existirem somente 2 valores
    Pessoa Física PF e Pessoa Jurica PJ.
 */

public class Client implements Serializable {

    private String name;
    private String email;
    private Integer phone;
    private Date birthdate;
    private Enum typePerson;
    private Integer document;
    private Integer addressId;

}
