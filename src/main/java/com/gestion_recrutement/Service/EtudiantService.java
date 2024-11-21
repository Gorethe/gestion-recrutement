package com.gestion_recrutement.Service;

import com.gestion_recrutement.model.DocumentModele;
import com.gestion_recrutement.model.EtudiantModele;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion_recrutement.model.DocumentModele;
import com.gestion_recrutement.model.EtudiantModele;
import com.gestion_recrutement.repository.DocumentRepository;
import com.gestion_recrutement.repository.EtudiantRepository;

import java.util.Date;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Transactional
    public void enregistrerEtudiantEtDocument(String nom, String prenom, String email, Date dateDeNaissance,
                                              String telephone, String nomDocument, String typeDocument, byte[] contenu) {
        // Créer un étudiant
        EtudiantModele etudiant = new EtudiantModele();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setDateDeNaissance(dateDeNaissance);
        etudiant.setTelephone(telephone);

        // Enregistrer l'étudiant pour obtenir son ID
        EtudiantModele etudiantEnregistre = etudiantRepository.save(etudiant);

        // Créer le document lié à l'étudiant
        DocumentModele document = new DocumentModele();
        document.setEtudiant(etudiantEnregistre);
        document.setNomDocument(nomDocument);
        document.setTypeDocument(typeDocument);
        document.setContenu(contenu);
        document.setDateUpload(new Date());

        // Enregistrer le document
        documentRepository.save(document);
    }
}
