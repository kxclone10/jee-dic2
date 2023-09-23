package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Magasin;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class MagasinFacade extends AbstractFacade<Magasin>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public MagasinFacade() {
        super(Magasin.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
