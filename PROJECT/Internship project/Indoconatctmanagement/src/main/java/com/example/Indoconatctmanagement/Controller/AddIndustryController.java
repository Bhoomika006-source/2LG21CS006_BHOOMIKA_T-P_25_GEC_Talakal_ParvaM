package com.example.Indoconatctmanagement.Controller;

import com.example.Indoconatctmanagement.model.Industry; // ✅ Import your model
import com.example.Indoconatctmanagement.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddIndustryController {

    @Autowired
    private IndustryService industryService;

    @PostMapping("/addIndustry")
    public String addIndustry(@ModelAttribute Industry industry) {
        industryService.saveIndustry(industry); // ✅ Use correct variable
        return "redirect:/success"; // You can customize this
    }
}
