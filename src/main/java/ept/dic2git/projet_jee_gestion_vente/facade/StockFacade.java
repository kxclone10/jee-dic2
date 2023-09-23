package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Stock;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class StockFacade extends AbstractFacade<Stock>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public StockFacade() {
        super(Stock.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
