package com.gestion_recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion_recrutement.model.DocumentModele;

public interface DocumentRepository extends JpaRepository<DocumentModele, Integer> {
}
