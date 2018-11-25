package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessory implements ISell {

    public GuitarStrings(String type, String make, String model, int costPrice, int salePrice ){
        super(type, make, model, costPrice, salePrice);
    }


}
