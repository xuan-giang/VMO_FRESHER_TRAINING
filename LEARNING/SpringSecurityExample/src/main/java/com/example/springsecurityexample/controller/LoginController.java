package com.example.springsecurityexample.controller;

import com.example.springsecurityexample.model.User;
import com.example.springsecurityexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPage() {

        return "login";
    }

    @GetMapping("/signup")
    public String signupGet() {
        System.out.println("This is signup page");
        return "signup";
    }

    @PostMapping("/signup-post")
    public String signupPost(@RequestParam("username") String username, @RequestParam("password") String password) {

        User u = new User();


        System.out.println(username);
        System.out.println(password);

        u.setUsername(username);
        u.setPassword(password);
        userService.createUser(u);

        System.out.println("Sign up successfully");
        return "redirect:/login";
    }

}
