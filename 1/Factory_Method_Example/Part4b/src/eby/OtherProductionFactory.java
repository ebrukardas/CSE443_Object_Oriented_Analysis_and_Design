package eby;

/**
 * Other area Factory
 *
 * @author ekardas
 */
public class OtherProductionFactory implements PlaneFactory{

    @Override
    public Plane productPlane(String model){
        Plane plane;
        if( model.compareTo("TPX100") == 0 )
            plane = new OtherPlane100();
        else if( model.compareTo("TPX200") == 0 )
            plane = new OtherPlane200();
        else if( model.compareTo("TPX300") == 0 )
            plane = new OtherPlane300();
        else
            throw new IllegalArgumentException("No such a plane");

        plane.constructSkeleton();
        plane.placeEngine();
        plane.placeSeats();

        return plane;
    }


}
