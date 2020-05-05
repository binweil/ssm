package com.amazon;

import com.amazon.dao.AccountDAO;
import com.amazon.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Autowired
    private AccountDAO accountDAO;

    @Test
    public void testMyBatisFindAll () throws Exception{
        // Load configuration file
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig-unused.xml");
        // Create SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // Create Session
        SqlSession session = factory.openSession();
        // Get Mapper
        AccountDAO dao = session.getMapper(AccountDAO.class);
        // Perform query
        List<Account> accountList = dao.findAll();
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i).toString());
        }
        // Close resources
        session.close();
        inputStream.close();
    }

    @Test
    public void testMyBatisSaveAccount () throws Exception{
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig-unused.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        AccountDAO dao = session.getMapper(AccountDAO.class);

        Account account = new Account();
        account.setId("2");
        account.setName("Binwei");
        account.setMoney("100");
        dao.saveAccount(account);
        // Need to commit the changes
        session.commit();

        session.close();
        inputStream.close();
    }
}
