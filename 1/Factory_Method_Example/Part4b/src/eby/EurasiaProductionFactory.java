package eby;

/**
 * Eurasia area Factory
 *
 * @author ekardas
 */
public class EurasiaProductionFactory implements PlaneFactory{

    public Plane productPlane(String model){
        Plane plane;
        if( model.compareTo("TPX100") == 0 )
            plane = new EurasiaPlane100();
        else if( model.compareTo("TPX200") == 0 )
            plane = new EurasiaPlane200();
        else if( model.compareTo("TPX300") == 0 )
            plane = new EurasiaPlane300();
        else
            throw new IllegalArgumentException("No such a plane");

        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }


}
