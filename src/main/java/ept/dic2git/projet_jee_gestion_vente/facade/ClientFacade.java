package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Client;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Stateless
public class ClientFacade extends AbstractFacade<Client>{
    @PersistenceContext(name = "dic2PU")
    private EntityManager entityManager;
    public ClientFacade() {
        super(Client.class);
    }
    protected EntityManager getEntityManager(){
        return entityManager;
    };
}
