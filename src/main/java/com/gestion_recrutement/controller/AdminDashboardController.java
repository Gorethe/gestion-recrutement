package com.gestion_recrutement.controller;
import com.gestion_recrutement.model.InscriptionModele;

import com.gestion_recrutement.Service.AdminDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminDashboardController {

    @Autowired
    private AdminDashboardService adminDashboardService;

    @GetMapping("/admin/utilisateurs")
    public String afficherDashboard(Model model) {
        List<InscriptionModele> inscriptions = adminDashboardService.recupererInscriptions();
        model.addAttribute("inscriptions", inscriptions);  // Ajoute la liste des utilisateurs au modèle
        return "dashboard";  // Retourne la vue correspondante au dashboard
    }
}
