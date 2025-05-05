package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyerController {

    @GetMapping("/buyers")
    public String getBuyersPage() {
        return "buyers"; // resolves to templates/buyers.html
    }
}
