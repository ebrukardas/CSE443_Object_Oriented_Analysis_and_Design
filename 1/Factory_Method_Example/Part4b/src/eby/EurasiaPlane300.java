package eby;

/**
 * Abstract class to abstract of all production details for TPX300 in Eurasia Area
 *
 * @author ekardas
 */
public class EurasiaPlane300 extends EurasiaPlane {

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

    /*
     *
     * */
    @Override
    public String getModel(){ return "TPX300"; }

    @Override
    public String getPurpose(){ return "Transatlantic Flight"; }


}
