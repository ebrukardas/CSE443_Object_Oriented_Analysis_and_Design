package eby;

/**
 * Domestic area Factory
 *
 * @author ekardas
 */
public class DomesticProductionFactory implements PlaneFactory{

    public Plane productPlane(String model){
        Plane plane;
        if( model.compareTo("TPX100") == 0 )
            plane = new DomesticPlane100();
        else if( model.compareTo("TPX200") == 0 )
            plane = new DomesticPlane200();
        else if( model.compareTo("TPX300") == 0 )
            plane = new DomesticPlane300();
        else
            throw new IllegalArgumentException("No such a plane");

        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }


}
