package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

	@Autowired
	ClientRepository clientRepository;
  
    @GetMapping("/clients")
    public String greeting(Model model) {
        model.addAttribute("clients", clientRepository.findAll());
        return "clientsList";
    }
}