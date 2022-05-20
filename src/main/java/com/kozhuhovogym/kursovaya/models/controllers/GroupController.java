package com.kozhuhovogym.kursovaya.models.controllers;

import com.kozhuhovogym.kursovaya.models.group;
import com.kozhuhovogym.kursovaya.repo.groupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {

    @Autowired
    private groupRepository groupRepository;

    @GetMapping("/group")
    public String groupMain(Model model) {
        Iterable<group> Group = groupRepository.findAll();
        model.addAttribute("group", Group);
        return "group-main";
    }
}
