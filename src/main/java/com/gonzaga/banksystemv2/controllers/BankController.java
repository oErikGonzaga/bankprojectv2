package com.gonzaga.banksystemv2.controllers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*  Os Controllers são nossas portas de Entrada,
    nossos End Points, nossa porta de entrada da aplicação.
    Um Controller é responsavel por:
    enviar requests e receber responses */

/*  @RestController: deixa nossa classe exposta,
    para ser acessada via api (Postman para testes) */

@RestController
public class BankController {

    // @PostMapping: cria um registro atraves do verbo Post (Http), através da URL de acesso.
    @PostMapping("api/create")
    public String createAccounte(){
        return "Sucess";
    }

}
