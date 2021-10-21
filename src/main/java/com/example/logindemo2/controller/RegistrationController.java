package com.example.logindemo2.controller;

import com.example.logindemo2.model.User;
import com.example.logindemo2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("reg")
@RequiredArgsConstructor
@Controller
public class RegistrationController {

    private final UserService userService;

    @GetMapping
    public String regPage() {
        return "reg";
    }

    @PostMapping
    public String regPageRegisterUser(@RequestParam String username,
                                      @RequestParam String password) {
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        userService.saveUser(user);
        userService.addRoleToUser(username, "ROLE_USER");

        return "redirect:/login";

    }

}
