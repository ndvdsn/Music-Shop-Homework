import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
//    private double profitMargin;
    private ArrayList<ISell> stock;


    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
//        this.profitMargin = 0.0;
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

    public double calculateMarkup(ISell item){
        double profitMargin = 0;
        for (ISell iSell : stock) {
            profitMargin += iSell.calculateMarkup();
        }
        return profitMargin;
    }



//    public double calculateTotalMarkup(ISell item){
//
//        double total = 0;
//        for(ISell iSell : stock ) {
//            iSell.calculateMarkup();
//            total ++;
//        }
//        return total;
//
//    }





}
