package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String make;
    private String model;
    private String finish;


    public Guitar(String material, String type, String newSecondHand, int costPrice, int salePrice, String make, String model, String finish){
        super(material, type, newSecondHand, costPrice, salePrice);
        this.make = make;
        this.model = model;
        this.finish = finish;
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




}
