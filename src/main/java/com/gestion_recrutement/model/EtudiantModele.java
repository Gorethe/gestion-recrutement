package com.gestion_recrutement.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_ETUDIANTS")
public class EtudiantModele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ETUDIANT")
    private Long id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "PRENOM")
    private String prenom;

    @Column(name = "ADRESSE_EMAIL")
    private String email;

    @Column(name = "DT_DE_NAISSANCE")
    private Date dateNaissance;

    @Column(name = "NUMERO_DE_TELEPHONE")
    private String telephone;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocumentModele> documents  = new ArrayList<>();

    // Getters et setters

    public List<DocumentModele> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentModele> documents) {
        this.documents = documents;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateNaissance = dateDeNaissance;
    }
}

