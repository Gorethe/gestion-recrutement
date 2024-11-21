package com.gestion_recrutement.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_DOCUMENT")
public class DocumentModele {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DOCUMENT")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_ETUDIANT", nullable = false)
    private EtudiantModele etudiant;

    @Column(name = "NOM_DOCUMENT")
    private String nomDocument;

    @Column(name = "TYPE_DOCUMENT")
    private String typeDocument;

    @Lob
    @Column(name = "CONTENU")
    private byte[] contenu;

    @Column(name = "DATE_UPLOAD")
    private Date dateUpload;

    // Getters et setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EtudiantModele getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(EtudiantModele etudiant) {
        this.etudiant = etudiant;
    }

    public String getNomDocument() {
        return nomDocument;
    }

    public void setNomDocument(String nomDocument) {
        this.nomDocument = nomDocument;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public byte[] getContenu() {
        return contenu;
    }

    public void setContenu(byte[] contenu) {
        this.contenu = contenu;
    }

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }
}
