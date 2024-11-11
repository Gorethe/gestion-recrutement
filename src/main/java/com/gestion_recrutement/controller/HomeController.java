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

    @GetMapping("/about")
    public String about() {
        return "about"; //
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact"; //
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses"; //
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog"; //
    }

//    @GetMapping("/admin/login")
//    public String adminLogin() {
//        return "login"; // Nom du template HTML pour le formulaire de connexion
//    }

}

