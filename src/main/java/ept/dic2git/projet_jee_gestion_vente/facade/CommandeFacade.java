package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Commande;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class CommandeFacade extends AbstractFacade<Commande>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public CommandeFacade() {
        super(Commande.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
