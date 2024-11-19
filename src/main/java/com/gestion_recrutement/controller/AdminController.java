package com.gestion_recrutement.controller;

import com.gestion_recrutement.model.Admin;
import com.gestion_recrutement.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/login")
    public String showLoginForm() {
        return "login"; // Affiche le formulaire de connexion
    }

    @PostMapping("/admin/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("mot_de_passe") String motDePasse,
                        Model model) {
        // Vérifie l'authentification
        Admin admin = adminService.findByEmailAndPassword(email, motDePasse);

        if (admin != null) {
            model.addAttribute("success", "Connexion réussie");
            return "redirect:/home"; // Redirige vers /home pour afficher index.html après connexion réussie
            //return "redirect:/admin/dashboard"; // Redirige vers le tableau de bord si les informations sont correctes
        } else {
            model.addAttribute("error", "Identifiants incorrects");
            return "login"; // Affiche à nouveau le formulaire avec un message d'erreur
        }
    }
//
//    @GetMapping("/admin/dashboard")
//    public String dashboard() {
//        return "dashboard"; // Affiche le tableau de bord
//    }
}
