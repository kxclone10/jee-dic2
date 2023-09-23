package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Employe;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addEmployeMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class EmployeAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private EmployeFacade employeFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Employe employe =new Employe("41","Arauna","Pouye",112.2);
    private Employe employe =new Employe();

    private String message ="";
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Employe enregistré";
        employeFacade.create(employe);
        System.out.println("Employe enregistré" + employe);
        employe = new Employe();
        return  "listeEmployes.xhtml?faces-redirect=true";
    }
}
