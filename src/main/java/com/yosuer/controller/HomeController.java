package com.yosuer.controller;

import com.yosuer.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("personas", personaService.obtenerTodos());
        return "home";
    }
}
