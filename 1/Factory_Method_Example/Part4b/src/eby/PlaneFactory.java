package eby;

/**
 * Interface to abstract of all production details in TAI Plane Factory
 *
 * @author ekardas
 */
public interface PlaneFactory {
    /**
     * This method is used to create the plane that requested
     * @param model Plane model to create in TAI
     * @return Requested plane
     */
    Plane productPlane(String model);
}