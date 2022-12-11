package com.gonzaga.banksystemv2.requests;

import lombok.Data;

import java.io.Serializable;

/*  Esta Classe receberá todos os objetos do frontEnd,
    ou seja, todas os dados enviados na request. */
@Data
public class AccountRequest implements Serializable {

    private String name;
    private String document;
    private String birthdate;
    private String phone;
    private String email;
    private String cep;
    private String number;
    private String secondAddress;
    private String password;

}
