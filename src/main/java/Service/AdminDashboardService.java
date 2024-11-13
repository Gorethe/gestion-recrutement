package com.gestion_recrutement.service;

import com.gestion_recrutement.model.InscriptionModele;
import com.gestion_recrutement.repository.InscriptionRepository;
import com.gestion_recrutement.repository.AdminDashboardRepository;
import com.gestion_recrutement.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDashboardService {

    @Autowired
    private InscriptionRepository inscriptionRepository;
//    public List<InscriptionModele> recupererUtilisateurs() {
    public List<InscriptionModele> recupererInscriptions() {
        return inscriptionRepository.findAll();
      //  return adminDashboardRepository.findAll();  // Récupère tous les utilisateurs dans la base de données
    }
}
