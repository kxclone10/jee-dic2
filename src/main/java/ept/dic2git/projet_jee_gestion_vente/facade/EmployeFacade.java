package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Employe;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class EmployeFacade extends AbstractFacade<Employe>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public EmployeFacade() {
        super(Employe.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
