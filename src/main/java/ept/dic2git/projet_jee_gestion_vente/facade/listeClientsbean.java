package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Client;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("listeClientsMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class listeClientsbean implements Serializable {
    @EJB // Permet de dire au serveur de
    private ClientFacade clientFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Client client =new Client("41","Arauna","Pouye",112.2);
    private Client selected_client ;
    private List<Client> clients;

    public Client getSelected_client() {
        return selected_client;
    }

    public void setSelected_client(Client selected_client) {
        this.selected_client = selected_client;
    }

    public List<Client> getClients() {
        if (clients==null) {
            clients=clientFacade.findAll();
        }
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}

