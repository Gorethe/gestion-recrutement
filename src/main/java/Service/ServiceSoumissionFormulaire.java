package com.gestion_recrutement.service;  // Déclaration correcte du package

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion_recrutement.model.InscriptionModele;
import com.gestion_recrutement.repository.InscriptionRepository;

@Service
public class ServiceSoumissionFormulaire {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    public void enregistrerInscription(String nom, String prenom, String email, String dateNaissance, String classe, String telephone) {
        InscriptionModele inscription = new InscriptionModele();
        inscription.setNom(nom);
        inscription.setPrenom(prenom);
        inscription.setEmail(email);
        inscription.setDateNaissance(dateNaissance);
        inscription.setClasse(classe);
        inscription.setTelephone(telephone);
        inscriptionRepository.save(inscription);
    }
}
