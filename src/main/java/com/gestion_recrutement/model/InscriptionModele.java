package com.gestion_recrutement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ETUDIANTS")
public class InscriptionModele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ETUDIANT") // Colonne de la clé primaire (remplacez par la colonne réelle de la clé primaire)
    private Long id;

    @Column(name = "NOM") // Nom de la colonne dans la base de données
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    @Column(name = "ADRESSE_EMAIL")
    private String email;

    @Column(name = "DT_DE_NAISSANCE")
    private String dateNaissance;
    private String date_inscription;
    private String annee_scolaire;
    private String telephone;
    private String documents;

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getDate_inscription() {return date_inscription; }

    public void setDate_inscription(String date_inscription) {this.date_inscription = date_inscription;}

    public String getAnnee_scolaire() {
        return annee_scolaire;
    }

    public void setAnnee_scolaire(String annee_scolaire) {
        this.annee_scolaire = annee_scolaire;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

}

