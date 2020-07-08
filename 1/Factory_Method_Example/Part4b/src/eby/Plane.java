package eby;

/**
 * Interface to abstract of all plane details (with features)
 *
 * @author ekardas
 */
public interface Plane {

    String getModel();
    String getPurpose();
    String getEngineInjection();
    String getMarket();
    String getSeatingCover();

    /**
     * Method to assign the skeleton of the plane
     * @return Skeleton type
     */
    String constructSkeleton( );

    /**
     * Method to assign the engine of the plane
     * @return Engine type
     */
    String placeEngine( );

    /**
     * Method to assign the seat number of the plane
     * @return Seat number
     */
    int placeSeats( );

}