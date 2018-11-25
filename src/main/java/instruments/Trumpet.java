package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private String make;
    private String model;
    private String finish;
    private int numberOfValves;



    public Trumpet(String material, String type, String newSecondHand, int costPrice, int salePrice, String make, String model, String finish, int numberOfValves){
        super(material, type, newSecondHand, costPrice, salePrice);
        this.make = make;
        this.model = model;
        this.finish = finish;
        this.numberOfValves = numberOfValves;
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

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }
}
