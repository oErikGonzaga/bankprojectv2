package com.gonzaga.banksystemv2.services;

import com.gonzaga.banksystemv2.models.Account;
import com.gonzaga.banksystemv2.requests.AccountRequest;

public interface BankService {

    Account createAccount(AccountRequest request);
}
