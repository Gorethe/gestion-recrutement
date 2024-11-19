package com.gestion_recrutement.repository;

import com.gestion_recrutement.model.InscriptionModele;  // Ajoutez cet import
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<InscriptionModele, Long> {

}
