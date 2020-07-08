package eby;

/**
 * Production and support the plane production abstraction
 *
 * @author ekardas
 */
public class ProductionFactory implements PlaneFactory{

    /**
     * Products plane according to the model
     *
     * @param model Plane model
     * @return Wanted plane
     */
    public Plane productPlane(String model){
        Plane plane;
        if( model.compareTo("TPX100") == 0 )
            plane = new Plane100();
        else if( model.compareTo("TPX200") == 0 )
            plane = new Plane200();
        else if( model.compareTo("TPX300") == 0 )
            plane = new Plane300();
        else
            throw new IllegalArgumentException("No such a plane");

        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }


}
