package com.gestion_recrutement.repository;

import com.gestion_recrutement.model.EtudiantModele;  // Ajoutez cet import
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<EtudiantModele, Integer> {

}
