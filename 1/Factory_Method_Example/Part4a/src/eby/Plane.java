package eby;

/**
 * Plane to product in the factory
 *
 * @author ekardas
 */
public interface Plane {

    /**
     * Model type
     *
     * @return Model type
     */
    String getModel();

    /**
     * Purpose
     *
     * @return Purpose
     */
    String getPurpose();

    /**
     * Construction the skeleton of the plane
     * @return skeleton type
     */
    String constructSkeleton( );

    /**
     * Place the engine to the plane
     * @return engine
     */
    String placeEngine( );

    /**
     * Place seats to the plane
     *
     * @return Seat numbers
     */
    int placeSeats( );

}