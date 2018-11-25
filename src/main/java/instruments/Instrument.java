package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String type;
    private String newSecondHand;
    private int costPrice;
    private int salePrice;

    public Instrument(String material, String type, String newSecondHand, int costPrice, int salePrice) {
        this.material = material;
        this.type = type;
        this.newSecondHand = newSecondHand;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewSecondHand() {
        return newSecondHand;
    }

    public void setNewSecondHand(String newSecondHand) {
        this.newSecondHand = newSecondHand;
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

    public String play(String playing){
        return "playing " + playing + " sounds";
    }
}
