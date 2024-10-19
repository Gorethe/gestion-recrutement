package com.gestion_recrutement.controller;
import org.springframework.ui.Model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
       // model.addAttribute("message", "Bienvenue sur la page d'accueil avec Bootstrap!");
        return "index"; // Retourne le fichier index.html
    }
}


//    public String home(Model model) {
//        model.addAttribute("message", "Bienvenue sur la page d'accueil avec Bootstrap!");

