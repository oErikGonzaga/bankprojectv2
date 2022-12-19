package com.gonzaga.banksystemv2.services;

import com.gonzaga.banksystemv2.models.Account;
import com.gonzaga.banksystemv2.requests.AccountRequest;

/*  Uma Interface e uma classe Abstrata. Nao pode ser instanciada apenas herdada.
Nao pode ter um objeto criado a partir de sua instanciacao.
Ela serve pra que outras classes implemente seus metodos. */

public interface BankService {

    Account createAccount(AccountRequest request);
}
