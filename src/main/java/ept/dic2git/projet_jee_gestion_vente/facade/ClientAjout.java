package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Client;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("addClientMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class ClientAjout implements Serializable {
    @EJB // Permet de dire au serveur de
    private ClientFacade clientFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Client client =new Client("41","Arauna","Pouye",112.2);
    private Client client =new Client();

    private String message ="";
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getMessage() {
        return message;
    }

    public String save (){
        message="Client enregistré";
        clientFacade.create(client);
        System.out.println("Client enregistré" + client);
        client = new Client();
        return  "listeClients.xhtml?faces-redirect=true";
    }
}
