package eby;

/**
 * Abstract class to abstract of all production details for TPX200 in Other Area
 *
 * @author ekardas
 */
public class OtherPlane200 extends OtherPlane {

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

    @Override
    public String getModel(){ return "TPX200"; }

    @Override
    public String getPurpose(){ return "Domestic & Short International Flight"; }

}
