package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Marque;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addMarqueMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class MarqueAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private MarqueFacade marqueFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Marque marque =new Marque("41","Arauna","Pouye",112.2);
    private Marque marque =new Marque();

    private String message ="";
    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Marque enregistré";
        marqueFacade.create(marque);
        System.out.println("Marque enregistré" + marque);
        marque = new Marque();
        return  "listeMarques.xhtml?faces-redirect=true";
    }
}
