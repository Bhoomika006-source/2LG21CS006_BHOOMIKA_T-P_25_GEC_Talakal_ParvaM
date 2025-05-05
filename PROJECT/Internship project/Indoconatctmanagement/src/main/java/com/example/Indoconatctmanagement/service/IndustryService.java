package com.example.Indoconatctmanagement.service;

import com.example.Indoconatctmanagement.model.Industry;
import com.example.Indoconatctmanagement.repository.IndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustryService {

    @Autowired
    private IndustryRepository industryRepository;

    public Industry saveIndustry(Industry industry) {
        return industryRepository.save(industry);
    }

    public List<Industry> getAllIndustries() {
        return industryRepository.findAll();
    }
}
