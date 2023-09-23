package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Categorie;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addCategorieMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class CategorieAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private CategorieFacade categorieFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Categorie categorie =new Categorie("41","Arauna","Pouye",112.2);
    private Categorie categorie =new Categorie();

    private String message ="";
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Categorie enregistré";
        categorieFacade.create(categorie);
        System.out.println("Categorie enregistré" + categorie);
        categorie = new Categorie();
        return  "listeCategories.xhtml?faces-redirect=true";
    }
}
