package com.gestion_recrutement.service;  // Déclaration correcte du package

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion_recrutement.model.InscriptionModele;
import com.gestion_recrutement.repository.InscriptionRepository;

@Service
public class ServiceSoumissionFormulaire {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    public void enregistrerInscription(String nom, String prenom, String email, String dateNaissance, String date_inscription, String annee_scolaire, String telephone, String documents) {
        InscriptionModele inscription = new InscriptionModele();
        inscription.setNom(nom);
        inscription.setPrenom(prenom);
        inscription.setEmail(email);
        inscription.setDateNaissance(dateNaissance);
        inscription.setDate_inscription(date_inscription);
        inscription.setAnnee_scolaire(annee_scolaire);
        inscription.setTelephone(telephone);
        inscription.setDocuments(documents);
        inscriptionRepository.save(inscription);
    }
}
