package com.bakbj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempController {

    @RequestMapping("/test1")
    public String test1() {
        return "common/register/temp";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "common/register/done";
    }
}
