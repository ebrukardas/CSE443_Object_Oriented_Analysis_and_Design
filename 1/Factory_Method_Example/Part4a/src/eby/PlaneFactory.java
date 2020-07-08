package eby;

/**
 * Plane factory to produce planes
 *
 * @author ekardas
 */
public interface PlaneFactory {

    /**
     * Product plane
     *
     * @param model Plane model
     * @return Wanted plane
     */
    Plane productPlane(String model);
}