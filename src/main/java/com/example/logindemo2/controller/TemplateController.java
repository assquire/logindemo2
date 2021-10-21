package com.example.logindemo2.controller;

import com.example.logindemo2.model.User;
import com.example.logindemo2.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String loginPage(Model model) {
        return "login";
    }

    @GetMapping
    public String indexPage(Model model) {
        return "index";
    }

}
