package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SteelController {
    @GetMapping("/")
    public String redirectToSteelPower() {
        return "redirect:/steelpower.html";
    }
}
