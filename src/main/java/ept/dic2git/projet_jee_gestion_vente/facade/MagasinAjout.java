package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Magasin;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addMagasinMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class MagasinAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private MagasinFacade magasinFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Magasin magasin =new Magasin("41","Arauna","Pouye",112.2);
    private Magasin magasin =new Magasin();

    private String message ="";
    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Magasin enregistré";
        magasinFacade.create(magasin);
        System.out.println("Magasin enregistré" + magasin);
        magasin = new Magasin();
        return  "listeMagasins.xhtml?faces-redirect=true";
    }
}
