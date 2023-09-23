package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Produit;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class ProduitFacade extends AbstractFacade<Produit>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public ProduitFacade() {
        super(Produit.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
