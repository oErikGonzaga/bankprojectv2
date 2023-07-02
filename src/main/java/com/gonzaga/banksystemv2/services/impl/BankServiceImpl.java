package com.gonzaga.banksystemv2.services.impl;

import com.gonzaga.banksystemv2.models.Account;
import com.gonzaga.banksystemv2.models.Address;
import com.gonzaga.banksystemv2.models.Client;
import com.gonzaga.banksystemv2.repositories.AccountRepository;
import com.gonzaga.banksystemv2.repositories.AddressRepository;
import com.gonzaga.banksystemv2.repositories.ClientRepository;
import com.gonzaga.banksystemv2.requests.AccountRequest;
import com.gonzaga.banksystemv2.services.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/* Essa classe e um bean, recebe um @Service
para indicar que ela esta mantendo a lógica de negócios */
@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

    /* Quando implementamos essa classe,
    automaticamente devemos adicionar os construtores usando @RequiredArgsConstructor
    */

    private final AccountRepository accountRepository;
    private final AddressRepository addressRepository;
    private final ClientRepository clientRepository;

    @Override
    public Account createAccount(AccountRequest request) {

        Account account = Account.builder().build();
        Address address = Address.builder().build();
        Client client = Client.builder().build();

        Account accountSaved = accountRepository.save(account);
        Address addressSaved = addressRepository.save(address);
        Client clientSaved = clientRepository.save(client);

        return account;
    }
}

/*  Resumindo os Comandos:
    Repository ->   Banco de Dados
    Services ->     Logica de Negocios
    Controller ->   Entrada dos nossos metodos.
 */
