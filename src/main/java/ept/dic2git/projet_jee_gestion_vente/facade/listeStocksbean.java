package ept.dic2git.projet_jee_gestion_vente.facade;

import ept.dic2git.projet_jee_gestion_vente.entities.Stock;
import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("listeStocksMbean") // on doit mettre le même nom que la classe avec la premiere lettre en miniscule
@ViewScoped // Pour dire que le managed bean aura une durée de vie de la page : tant que l'utilisateur est sur cette page , le managed bean existe

public class listeStocksbean implements Serializable {
    @EJB // Permet de dire au serveur de
    private StockFacade stockFacade;

    // C est pour créer des valeurs par défaut pour tout élève comme école: EPT par exemple
    //private Stock stock =new Stock("41","Arauna","Pouye",112.2);
    private Stock selected_stock ;
    private List<Stock> stocks;

    public Stock getSelected_stock() {
        return selected_stock;
    }

    public void setSelected_stock(Stock selected_stock) {
        this.selected_stock = selected_stock;
    }

    public List<Stock> getStocks() {
        if (stocks==null) {
            stocks=stockFacade.findAll();
        }
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}

