package com.gestion_recrutement.controller;  // Supprimez la déclaration en doublon
import org.springframework.web.bind.annotation.GetMapping;
import com.gestion_recrutement.service.ServiceSoumissionFormulaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SoumissionFormulaireController {

    @Autowired
    private ServiceSoumissionFormulaire serviceSoumissionFormulaire;

    // Méthode GET pour afficher le formulaire d'inscription
    @GetMapping("/inscription")
    public String afficherFormulaireInscription() {
        return "inscription"; // Vue du formulaire d'inscription (inscription.html)
    }

    @PostMapping("/inscription")
    public String enregistrerInscription(@RequestParam String nom,
                                         @RequestParam String prenom,
                                         @RequestParam String email,
                                         @RequestParam String dateNaissance,
                                         @RequestParam String date_inscription,
                                         @RequestParam String annee_scolaire,
                                         @RequestParam String telephone,
                                         @RequestParam String documents)
    {
        serviceSoumissionFormulaire.enregistrerInscription(nom, prenom, email, dateNaissance, date_inscription,annee_scolaire, telephone,documents);
        return "redirect:/";
//        return "redirect:/confirmation";
    }
}
