package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.ArticleCommande;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addArticleCommandeMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class ArticleCommandeAjout  implements Serializable {
    @EJB // Permet de dire au serveur de
    private ArticleCommandeFacade articleCommandeFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private ArticleCommande articleCommande =new ArticleCommande("41","Arauna","Pouye",112.2);
    private ArticleCommande articleCommande =new ArticleCommande();

    private String message ="";
    public ArticleCommande getArticleCommande() {
        return articleCommande;
    }

    public void setArticleCommande(ArticleCommande articleCommande) {
        this.articleCommande = articleCommande;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="ArticleCommande enregistré";
        articleCommandeFacade.create(articleCommande);
        System.out.println("ArticleCommande enregistré" + articleCommande);
        articleCommande = new ArticleCommande();
        return  "listeArticleCommandes.xhtml?faces-redirect=true";
    }
}
