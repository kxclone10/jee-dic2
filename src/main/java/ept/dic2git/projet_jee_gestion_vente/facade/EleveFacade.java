package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Eleve;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class EleveFacade extends AbstractFacade<Eleve>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public EleveFacade() {
        super(Eleve.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
