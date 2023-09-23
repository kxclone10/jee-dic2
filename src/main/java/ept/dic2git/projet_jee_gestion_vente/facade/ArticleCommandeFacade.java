package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.ArticleCommande;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class ArticleCommandeFacade extends AbstractFacade<ArticleCommande>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public ArticleCommandeFacade() {
        super(ArticleCommande.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
