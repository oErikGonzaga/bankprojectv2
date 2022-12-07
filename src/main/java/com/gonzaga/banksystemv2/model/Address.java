package com.gonzaga.banksystemv2.model;

import java.io.Serializable;

/*
    Primeira Classe, seguindo padrão MVC (Camada Modelo).
    Implementando Serializable
    * Responsável pela conversão de um objeto em “bytes”,
    útil para trafegar dados pela rede. *
 */

public class Address implements Serializable {

    private Long id;
    private Integer cep;
    private String city;
    private String state;
    private String number;
    private String address;
    private String secondAddress;
}
