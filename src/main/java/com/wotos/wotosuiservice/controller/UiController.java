package com.wotos.wotosuiservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UiController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
