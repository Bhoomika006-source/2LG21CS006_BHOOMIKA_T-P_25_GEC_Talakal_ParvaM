package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextileController {

    @GetMapping("/textile")
    public String showTextilePage() {
        return "Textileindustry"; // No .html extension
    }
}
