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
    private String cep;
    private String city;
    private String state;
    private String address;
    private String houseNumber;
    private String secondAddress;
}
