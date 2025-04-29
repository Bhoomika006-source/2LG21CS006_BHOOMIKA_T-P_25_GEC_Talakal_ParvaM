package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Home")
    public String homePage() {
        return "home"; // resolves to home.html
    }

    @GetMapping("/buyers")
    public String buyers() {
        return "buyers"; // buyers.html
    }

    @GetMapping("/supplier_login")
    public String supplier_login() {
        return "supplier_login"; // file: supplier_login.html
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Refers to dashboard.html in templates
    }

    @GetMapping("/industry-machinery")
    public String industryMachinery() {
        return "industryMachinery"; // Spring Boot will serve from static/
    }

    @GetMapping("/textile-industry")
    public String textileIndustry() {
        return "Textileindustry";
    }

    @GetMapping("/construction-equipment")
    public String constructionequipment() {
        return "constructionequipment";
    }

    @GetMapping("/steel-power")
    public String steelpower() {
        return "steelpower";
    }

    @GetMapping("/admin-login")
    public String showAdminLoginPage() {
        return "adminloginpage"; // no .html needed if inside 'templates'
    }

}
