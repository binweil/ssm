package com.amazon.service.impl;

import com.amazon.dao.AccountDAO;
import com.amazon.domain.Account;
import com.amazon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    /**
     * Find all account information
     */
    public List<Account> findAll() {
        System.out.println("Service Layer: find all account information");
        List<Account> accounts = accountDAO.findAll();
        return accounts;
    };

    /**
     * Save Account Information
     */
    public void saveAccount(Account account) {
        System.out.println("Service Layer: save account information");
        accountDAO.saveAccount(account);
    };

}
