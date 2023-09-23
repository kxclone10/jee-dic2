package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Commande;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("listeCommandesMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class listeCommandebean implements Serializable {
    @EJB // Permet de dire au serveur de
    private CommandeFacade commandeFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Commande commande =new Commande("41","Arauna","Pouye",112.2);
    private Commande selected_commande ;
    private List<Commande> commandes;

    public Commande getSelected_commande() {
        return selected_commande;
    }

    public void setSelected_commande(Commande selected_commande) {
        this.selected_commande = selected_commande;
    }

    public List<Commande> getCommandes() {
        if (commandes==null) {
            commandes=commandeFacade.findAll();
        }
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}

