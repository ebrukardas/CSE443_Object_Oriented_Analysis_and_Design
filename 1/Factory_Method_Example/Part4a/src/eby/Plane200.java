package eby;

/**
 * TPX 200 plane
 *
 * @author ekardas
 */
public class Plane200 implements Plane {

    @Override
    public String constructSkeleton( ){
        return "Nickel Alloy";
    }

    @Override
    public String placeEngine( ){
        return "Twin Jet Engine";
    }
    @Override
    public int placeSeats( ){
        return 100;
    }

    /*
     *
     * */
    @Override
    public String getModel(){ return "TPX200"; }

    @Override
    public String getPurpose(){ return "Domestic & Short International Flight"; }
    @Override
    public String toString(){
        return getModel() + " " + getPurpose();
    }
}
