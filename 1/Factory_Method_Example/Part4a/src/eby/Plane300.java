package eby;

/**
 * TPX 300 plane
 *
 * @author ekardas
 */
public class Plane300 implements Plane {

    @Override
    public String constructSkeleton( ){
        return "Titanium Alloy";
    }

    @Override
    public String placeEngine( ){
        return "Transatlantic Flight";
    }
    @Override
    public int placeSeats( ){
        return 250;
    }


    @Override
    public String getModel(){ return "TPX300"; }

    @Override
    public String getPurpose(){ return "Transatlantic Flight"; }
    @Override
    public String toString(){
        return getModel() + " " + getPurpose();
    }
}
