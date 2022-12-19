package com.gonzaga.banksystemv2.controllers;

import com.gonzaga.banksystemv2.models.Account;
import com.gonzaga.banksystemv2.requests.AccountRequest;
import com.gonzaga.banksystemv2.services.BankService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*  Os Controllers são nossas portas de Entrada,
    nossos End Points, nossa porta de entrada da aplicação.
    Um Controller é responsavel por:
    enviar requests e receber responses */

/*  @RestController: deixa nossa classe exposta,
    para ser acessada via api (Postman para testes) */

@Slf4j
@RestController
public class BankController {

    @Autowired // -> Marca a classe como um Java'Bean
    private BankService bankService;

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
