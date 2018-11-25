import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;


    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int itemCount(){
        return this.stock.size();
    }

    public void addToStock(ISell item){
        this.stock.add(item );
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }



}
