package ept.dic2git.projet_jee_gestion_vente.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produit {
    private Integer id;
    private String nom;
    private Short anneeModel;
    private BigDecimal prixMarque;
    private Integer marqueId;
    private Integer categorieId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "annee_model")
    public Short getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(Short anneeModel) {
        this.anneeModel = anneeModel;
    }

    @Basic
    @Column(name = "prix_marque")
    public BigDecimal getPrixMarque() {
        return prixMarque;
    }

    public void setPrixMarque(BigDecimal prixMarque) {
        this.prixMarque = prixMarque;
    }

    @Basic
    @Column(name = "marque_id")
    public Integer getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(Integer marqueId) {
        this.marqueId = marqueId;
    }

    @Basic
    @Column(name = "categorie_id")
    public Integer getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Integer categorieId) {
        this.categorieId = categorieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        if (id != null ? !id.equals(produit.id) : produit.id != null) return false;
        if (nom != null ? !nom.equals(produit.nom) : produit.nom != null) return false;
        if (anneeModel != null ? !anneeModel.equals(produit.anneeModel) : produit.anneeModel != null) return false;
        if (prixMarque != null ? !prixMarque.equals(produit.prixMarque) : produit.prixMarque != null) return false;
        if (marqueId != null ? !marqueId.equals(produit.marqueId) : produit.marqueId != null) return false;
        if (categorieId != null ? !categorieId.equals(produit.categorieId) : produit.categorieId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (anneeModel != null ? anneeModel.hashCode() : 0);
        result = 31 * result + (prixMarque != null ? prixMarque.hashCode() : 0);
        result = 31 * result + (marqueId != null ? marqueId.hashCode() : 0);
        result = 31 * result + (categorieId != null ? categorieId.hashCode() : 0);
        return result;
    }
}
