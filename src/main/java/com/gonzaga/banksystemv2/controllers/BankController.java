package com.gonzaga.banksystemv2.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*  Os Controllers são nossas portas de Entrada,
    nossos End Points, nossa porta de entrada da aplicação.
    Um Controller é responsavel por:
    enviar requests e receber responses */

/*  @Slf4j permite que coloquemos logs de informacoes
    para indicar a evolucao do processo. (Em Producao
    nos nao debugamos o projeto, utilizamos logs para indicar os steps)*/

/*  @RestController: deixa nossa classe exposta,
    para ser acessada via api (Postman para testes) */

@Slf4j
@RestController
public class BankController {

    // @PostMapping: cria um registro atraves do verbo Post (Http), através da URL de acesso.
    @ResponseStatus(HttpStatus.CREATED) // "Settando" código de Sucesso Default 201.
    @PostMapping("api/create")
    public Account createAccount(@RequestBody AccountRequest request){
        log.info("BankController.createAccount init");

        Account account = bankService.createAccount(request);
        log.info("BankController.createAccount end");

        return account;
    }

}
