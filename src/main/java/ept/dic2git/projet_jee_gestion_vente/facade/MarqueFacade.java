package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Marque;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class MarqueFacade extends AbstractFacade<Marque>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public MarqueFacade() {
        super(Marque.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
