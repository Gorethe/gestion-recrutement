package com.gestion_recrutement.controller;  // Supprimez la déclaration en doublon

import org.springframework.web.bind.annotation.GetMapping;
import com.gestion_recrutement.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    // Méthode GET pour afficher le formulaire d'inscription
    @GetMapping("/inscription")
    public String afficherFormulaireInscription() {
        return "inscription"; // Vue du formulaire d'inscription (inscription.html)
    }

    @PostMapping("/inscription")
    public String enregistrerEtudiant(@RequestParam String nom,
                                      @RequestParam String prenom,
                                      @RequestParam String email,
                                      @RequestParam String dateDeNaissance,
                                      @RequestParam String telephone,
                                      @RequestParam String nomDocument,
                                      @RequestParam String typeDocument,
                                      @RequestParam("contenu") MultipartFile fichier) {
        try {
            // Si typeDocument est null, attribuez une valeur par défaut
            if (typeDocument == null) {
                typeDocument = "non spécifié";
            }
            // Conversion de la date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateNaissance = dateFormat.parse(dateDeNaissance);

            // Conversion du fichier en tableau d'octets
            byte[] contenu = fichier.getBytes();

            // Enregistrement de l'étudiant et du document
            etudiantService.enregistrerEtudiantEtDocument(nom, prenom, email, dateNaissance, telephone, nomDocument, typeDocument, contenu);
        } catch (ParseException e) {
            e.printStackTrace();
            return "errorDateFormat";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "redirect:/home"; // Redirige vers une page
    }
}
