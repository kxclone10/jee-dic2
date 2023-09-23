package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Employe;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("listeEmployesMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class listeEmployesbean implements Serializable {
    @EJB // Permet de dire au serveur de
    private EmployeFacade employeFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Employe employe =new Employe("41","Arauna","Pouye",112.2);
    private Employe selected_employe ;
    private List<Employe> employes;

    public Employe getSelected_employe() {
        return selected_employe;
    }

    public void setSelected_employe(Employe selected_employe) {
        this.selected_employe = selected_employe;
    }

    public List<Employe> getEmployes() {
        if (employes==null) {
            employes=employeFacade.findAll();
        }
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}

