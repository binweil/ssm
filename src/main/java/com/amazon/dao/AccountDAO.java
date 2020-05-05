package com.amazon.dao;

import com.amazon.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface AccountDAO {

    /**
     * Find all account information
     */
    @Select("SELECT * FROM account")
    public List<Account> findAll();

    /**
     * Save Account Information
     */
    @Select("INSERT into account (name, money) values (#{name}, #{money})")
    public void saveAccount(Account account);

}
