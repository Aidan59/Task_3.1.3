package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.kata.spring.boot_security.demo.model.User;

@ControllerAdvice
public class CurrentUserAdvice {

    @ModelAttribute("currentUser")
    public User currentUser(@AuthenticationPrincipal User user) {
        return user;
    }
}
