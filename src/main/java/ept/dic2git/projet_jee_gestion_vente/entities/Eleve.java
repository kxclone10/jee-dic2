package ept.dic2git.projet_jee_gestion_vente.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Objects;

@XmlRootElement(name = "eleve")
@Entity
public class Eleve implements Serializable {
    @Id
    private String numero;
    private String prenom;
    private String nom;
    private Double poids;

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Double getPoids() {
        return poids;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public Eleve(){
    }

    public Eleve(String numero, String prenom, String nom) {
        this.numero = numero;
        this.prenom = prenom;
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Eleve{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eleve eleve = (Eleve) o;
        return numero.equals(eleve.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
