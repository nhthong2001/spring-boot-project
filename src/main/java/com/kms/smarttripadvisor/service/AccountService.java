package com.kms.smarttripadvisor.service;

import com.kms.smarttripadvisor.model.Account;
import com.kms.smarttripadvisor.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findAccountByUsername(String username){
        return accountRepository.findAccountByUsername(username);
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
