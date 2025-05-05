package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupplierLoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username,
            @RequestParam String password,
            Model model) {

        if ("admin".equals(username) && "password123".equals(password)) {
            return "redirect:/dashboard.html";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "supplier_login"; // Assuming using Thymeleaf template
        }
    }
}
