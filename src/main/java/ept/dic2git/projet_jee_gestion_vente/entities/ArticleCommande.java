package ept.dic2git.projet_jee_gestion_vente.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "article_commande", schema = "public", catalog = "vente_velos")
public class ArticleCommande {
    private Integer numeroCommande;
    private Integer ligne;
    private Integer quantite;
    private BigDecimal prixDepart;
    private BigDecimal remise;
    private Integer id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "numero_commande")
    public Integer getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(Integer numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Basic
    @Column(name = "ligne")
    public Integer getLigne() {
        return ligne;
    }

    public void setLigne(Integer ligne) {
        this.ligne = ligne;
    }

    @Basic
    @Column(name = "quantite")
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "prix_depart")
    public BigDecimal getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(BigDecimal prixDepart) {
        this.prixDepart = prixDepart;
    }

    @Basic
    @Column(name = "remise")
    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleCommande that = (ArticleCommande) o;

        if (numeroCommande != null ? !numeroCommande.equals(that.numeroCommande) : that.numeroCommande != null)
            return false;
        if (ligne != null ? !ligne.equals(that.ligne) : that.ligne != null) return false;
        if (quantite != null ? !quantite.equals(that.quantite) : that.quantite != null) return false;
        if (prixDepart != null ? !prixDepart.equals(that.prixDepart) : that.prixDepart != null) return false;
        if (remise != null ? !remise.equals(that.remise) : that.remise != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numeroCommande != null ? numeroCommande.hashCode() : 0;
        result = 31 * result + (ligne != null ? ligne.hashCode() : 0);
        result = 31 * result + (quantite != null ? quantite.hashCode() : 0);
        result = 31 * result + (prixDepart != null ? prixDepart.hashCode() : 0);
        result = 31 * result + (remise != null ? remise.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
