package com.bakbj.controller;

import com.bakbj.GoHomeFastApplication;
import com.bakbj.domain.Account;
import com.bakbj.domain.AccountRepository;
import com.bakbj.security.MyUserDetails;
import com.bakbj.emailSender.NotificationService;
import groovy.lang.GrabExclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login() {
        return "common/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "common/logout";
    }

    @GetMapping("/register/form")
    public String registerForm() {
        return "common/register/form";
    }

    @PostMapping("/register")
    public String register(Account account, String email) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        accountRepository.save(account);

        MyUserDetails userDetails = new MyUserDetails(account);
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        try {
            notificationService.sendNotification(email, accountRepository.findByEmail(email).getId());
        } catch (MailException e) {
            e.printStackTrace();
        }

        return "common/register/temp";
    }

    @GetMapping("/register/changeRole/{id}")
    public String changRole(@PathVariable Long id) {

        Account account = accountRepository.findOne(id);
        account.updateRole("ROLE_USER");
        accountRepository.save(account);
        return "common/register/done";
    }

    @GetMapping("/accounts")
    public String accounts(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        return "accounts";
    }



}
