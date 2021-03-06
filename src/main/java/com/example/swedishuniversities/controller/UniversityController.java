package com.example.swedishuniversities.controller;

import com.example.swedishuniversities.model.SimpleUniversity;
import com.example.swedishuniversities.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UniversityController {

    @Autowired
    UniversityService universityService;



    @GetMapping("/all")
    public String getAllUniversities(Model model){
        List<SimpleUniversity> universities = universityService.getSimpleUniversities();
        model.addAttribute("universities", universities);
        return "index";
    }

}
