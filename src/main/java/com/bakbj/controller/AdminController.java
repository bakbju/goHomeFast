package com.bakbj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/page1")
    public String page1() {
        return "role_admin/page1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "role_admin/page2";
    }
}
