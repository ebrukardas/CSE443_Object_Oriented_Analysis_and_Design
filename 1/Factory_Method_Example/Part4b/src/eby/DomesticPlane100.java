package eby;

/**
 * Abstract class to abstract of all production details for TPX100 in Domestic Area
 *
 * @author ekardas
 */
public class DomesticPlane100 extends DomesticPlane {

    @Override
    public String constructSkeleton( ){
        return "Aluminium Alloy";
    }

    @Override
    public String placeEngine( ){
        return "Single jet engine";
    }
    @Override
    public int placeSeats( ){
        return 50;
    }

    /*
    *
    * */
    @Override
    public String getModel(){ return "TPX100"; }

    @Override
    public String getPurpose(){ return "Domestic Flight"; }


}
