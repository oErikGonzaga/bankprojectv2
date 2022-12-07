package com.gonzaga.banksystemv2.model;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {

    private Integer clientID;
    private Integer agency;
    private Integer number;
    private Integer balance;
    private Enum accountType;
    private Date dateActivation;
    private Date dateDeactivation;


}
