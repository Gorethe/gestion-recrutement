package com.gestion_recrutement.Service;

import com.gestion_recrutement.model.EtudiantModele;
import com.gestion_recrutement.repository.EtudiantRepository;
//import repository.AdminDashboardRepository;
//import model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDashboardService {

    @Autowired
    private EtudiantRepository inscriptionRepository;
//    public List<InscriptionModele> recupererUtilisateurs() {
    public List<EtudiantModele> recupererInscriptions() {
        return inscriptionRepository.findAll();
      //  return adminDashboardRepository.findAll();  // Récupère tous les utilisateurs dans la base de données
    }
}
