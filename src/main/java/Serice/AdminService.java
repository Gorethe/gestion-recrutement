package com.gestion_recrutement.service;

import com.gestion_recrutement.model.Admin;
import com.gestion_recrutement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin findByEmailAndPassword(String email, String motDePasse) {
        Optional<Admin> admin = adminRepository.findByEmailAndMotDePasse(email, motDePasse);
        return admin.orElse(null); // Retourne l'admin ou null si non trouvé
    }
}

