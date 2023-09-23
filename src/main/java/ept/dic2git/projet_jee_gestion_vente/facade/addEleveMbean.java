package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Eleve;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addEleveMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class addEleveMbean implements Serializable {
    @EJB // Permet de dire au serveur de
    private EleveFacade eleveFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Eleve eleve =new Eleve("41","Arauna","Pouye",112.2);
    private Eleve eleve =new Eleve();

    private String message ="";
    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Eleve enregistré";
        eleveFacade.create(eleve);
        System.out.println("Eleve enregistré" + eleve);
        eleve = new Eleve();
        return  "listeEleves.xhtml?faces-redirect=true";
    }
}
