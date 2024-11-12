package com.gestion_recrutement.controller;

import com.gestion_recrutement.service.AdminDashboardService;
import com.gestion_recrutement.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminDashboardController {

    @Autowired
    private AdminDashboardService adminDashboardService;

    @GetMapping("/admin/dashboard")
    public String afficherDashboard(Model model) {
        List<Utilisateur> utilisateurs = adminDashboardService.recupererUtilisateurs();
        model.addAttribute("utilisateurs", utilisateurs);  // Ajoute la liste des utilisateurs au modèle
        return "admin/dashboard";  // Retourne la vue correspondante au dashboard
    }
}
