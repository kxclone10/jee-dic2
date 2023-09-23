package ept.dic2git.projet_jee_gestion_vente.entities;

import jakarta.persistence.*;

@Entity
public class Magasin {
    private Integer id;
    private String nom;
    private String telephone;
    private String email;
    private String adresse;
    private String ville;
    private String etat;
    private String codeZip;

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
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "ville")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "etat")
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Basic
    @Column(name = "code_zip")
    public String getCodeZip() {
        return codeZip;
    }

    public void setCodeZip(String codeZip) {
        this.codeZip = codeZip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magasin magasin = (Magasin) o;

        if (id != null ? !id.equals(magasin.id) : magasin.id != null) return false;
        if (nom != null ? !nom.equals(magasin.nom) : magasin.nom != null) return false;
        if (telephone != null ? !telephone.equals(magasin.telephone) : magasin.telephone != null) return false;
        if (email != null ? !email.equals(magasin.email) : magasin.email != null) return false;
        if (adresse != null ? !adresse.equals(magasin.adresse) : magasin.adresse != null) return false;
        if (ville != null ? !ville.equals(magasin.ville) : magasin.ville != null) return false;
        if (etat != null ? !etat.equals(magasin.etat) : magasin.etat != null) return false;
        if (codeZip != null ? !codeZip.equals(magasin.codeZip) : magasin.codeZip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        result = 31 * result + (codeZip != null ? codeZip.hashCode() : 0);
        return result;
    }
}
