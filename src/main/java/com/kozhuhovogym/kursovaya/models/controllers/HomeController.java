package com.kozhuhovogym.kursovaya.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        return "index";
    }

    @GetMapping("/treners")
    public String treners(Model model) {
        model.addAttribute("title", "Тренеры");
        return "index";
    }

    @GetMapping("/group-main")
    public String groups(Model model) {
        model.addAttribute("title", "Групповые занятия");
        return "group-main";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Авторизация");
        return "login";
    }

}
