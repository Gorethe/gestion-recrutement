package com.gestion_recrutement.repository;

import com.gestion_recrutement.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);

    // Ajoutez cette méthode pour rechercher par email et mot de passe
    Optional<Admin> findByEmailAndMotDePasse(String email, String motDePasse);
}
