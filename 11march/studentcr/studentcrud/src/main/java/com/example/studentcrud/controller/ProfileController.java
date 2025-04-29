package com.example.studentcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.studentcrud.model.Profile;
import com.example.studentcrud.service.ProfileService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/bhoom")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("profile", profileService.listAll());
        return "profile/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("profile", new Profile());
        return "profile/create";
    }

    @PostMapping("/save")
    public String saveProfile(@ModelAttribute Profile pro) {
        profileService.saveProfile(pro);
        return "redirect:/bhoom/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteStaff(@PathVariable Long id) {
        profileService.deleteProfile(id);
        return "redirect:/bhoom/list";
    }

    @GetMapping("/edit/{id}")
    public String editStaff(@PathVariable Long id, Model model) {
        model.addAttribute("staff", profileService.getProfile(id));
        return "profile/edit";

    }

}