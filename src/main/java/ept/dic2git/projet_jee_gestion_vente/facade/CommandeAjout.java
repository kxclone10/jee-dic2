package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Commande;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addCommandeMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class CommandeAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private CommandeFacade commandeFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Commande commande =new Commande("41","Arauna","Pouye",112.2);
    private Commande commande =new Commande();

    private String message ="";
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Commande enregistré";
        commandeFacade.create(commande);
        System.out.println("Commande enregistré" + commande);
        commande = new Commande();
        return  "listeCommandes.xhtml?faces-redirect=true";
    }
}
