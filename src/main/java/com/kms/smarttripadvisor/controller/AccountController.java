package com.kms.smarttripadvisor.controller;

import com.kms.smarttripadvisor.model.Account;
import com.kms.smarttripadvisor.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

    @GetMapping("/{username}")
    public  Account getAccountByUsername(@PathVariable("username") String username){
        return accountService.findAccountByUsername(username);
    }

}
