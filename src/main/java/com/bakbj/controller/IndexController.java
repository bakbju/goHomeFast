package com.bakbj.controller;

import com.bakbj.domain.Account;
import com.bakbj.domain.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class IndexController {

//    @Autowired
//    AccountRepository accountRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
