import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> Stock;

    public Shop(ArrayList<ISell> stock) {
        Stock = stock;
    }

    public ArrayList<ISell> getShopInventory() {
        return Stock;
    }

    public void addToInventory(ISell item) {
        Stock.add(item);
    }

    public void removeFromInventory(ISell item){
        Stock.remove(item);
    }

    public double getTotalMarkup(ArrayList<ISell> stock) {
        double total = 0;
        for (ISell iSell : this.Stock) {
            total += iSell.calculateMarkup();
        }
        return total;
    }
}
