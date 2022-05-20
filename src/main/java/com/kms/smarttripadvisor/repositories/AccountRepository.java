package com.kms.smarttripadvisor.repositories;

import com.kms.smarttripadvisor.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    Account findAccountByUsername(String username);

    List<Account> findAll();
}
