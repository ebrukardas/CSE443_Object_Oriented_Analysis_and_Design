package eby;

/**
 * TPX 100 plane
 *
 * @author ekardas
 */
public class Plane100 implements Plane {

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

    @Override
    public String toString(){
        return getModel() + " " + getPurpose();
    }

}
