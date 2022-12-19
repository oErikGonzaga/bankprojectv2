package com.gonzaga.banksystemv2.services.impl;

import com.gonzaga.banksystemv2.models.Account;
import com.gonzaga.banksystemv2.requests.AccountRequest;
import com.gonzaga.banksystemv2.services.BankService;
import org.springframework.stereotype.Service;

/* Essa classe e um bean, recebe um @Service
para indicar que ela esta mantendo a logica de negocios */
@Service
public class BankServiceImpl implements BankService {
    @Override
    public Account createAccount(AccountRequest request) {

        Account account = new Account();
        account.setNumber(Long.valueOf(request.getNumber()));
        return account;
    }
}

/*  Resumindo os Comandos:
    Repository ->   Banco de Dados
    Services ->     Logica de Negocios
    Controller ->   ENtrada dos nossos metodos.
 */
