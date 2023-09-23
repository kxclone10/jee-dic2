package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Categorie;
import ept.dic2git.projet_jee_gestion_vente.entities.Eleve;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CategorieFacade extends AbstractFacade<Categorie>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public CategorieFacade() {
        super(Categorie.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
