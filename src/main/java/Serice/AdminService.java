package com.gestion_recrutement.service;

import com.gestion_recrutement.model.Admin;
import com.gestion_recrutement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AdminService {

    private static final Logger logger = LoggerFactory.getLogger(AdminService.class);

    @Autowired
    private AdminRepository adminRepository;

   // public Admin findByEmailAndPassword(String email, String motDePasse) {
   //     Optional<Admin> admin = adminRepository.findByEmailAndMotDePasse(email, motDePasse);
  //      return admin.orElse(null); // Retourne l'admin ou null si non trouvé
   // }

    public Admin findByEmailAndPassword(String email, String motDePasse) {
        logger.info("Recherche de l'admin avec l'email: {}", email); // Log avant la requête
        Optional<Admin> admin = adminRepository.findByEmailAndMotDePasse(email, motDePasse);
        if (admin.isPresent()) {
            Admin adminData = admin.get();
            logger.info("Admin trouvé : ID={}, Nom={}, Prenom={}, Email={}",
                    adminData.getId(), adminData.getNom(), adminData.getPrenom(), adminData.getEmail());
            return adminData;
        } else {
            logger.warn("Aucun admin trouvé avec cet email et mot de passe");
        }
        return admin.orElse(null); // Retourne l'admin ou null si non trouvé
    }
}

