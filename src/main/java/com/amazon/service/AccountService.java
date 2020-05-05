package com.amazon.service;

import com.amazon.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    /**
     * Find all account information
     */
    public List<Account> findAll();

    /**
     * Save Account Information
     */
    public void saveAccount(Account account);
}
