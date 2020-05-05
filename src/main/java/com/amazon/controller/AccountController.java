package com.amazon.controller;

import com.amazon.domain.Account;
import com.amazon.service.AccountService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    private Logger logger = LogManager.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAllAccount (Model model) {
        logger.info("Finding All Account");
        List<Account> accountList = accountService.findAll();
        model.addAttribute("accountList", accountList);
        return "list";
    }

    @RequestMapping("/save")
    public void saveAccount (Account account,
                               HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        logger.info("Saving Account");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
