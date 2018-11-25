package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String type;
    private String make;
    private String model;
    private int costPrice;
    private int salePrice;

    public Accessory(String type, String make, String model, int costPrice, int salePrice) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkup(){
        return this.salePrice - this.costPrice;
    }
}
