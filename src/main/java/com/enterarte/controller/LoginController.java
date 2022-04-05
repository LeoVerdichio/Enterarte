package com.enterarte.controller;



import com.enterarte.Service.CustomerService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    private CustomerService customerService;


    @GetMapping("/login")
    public String loginForm(@RequestParam(required = false) String error, ModelMap model) {
        if (error != null) {
            model.put("error", "Email o password incorrectos");
        }
        return "/login/login";
    }

}