package eby;

/**
 *  Abstract class to abstract of all production details for Plane in Eurasia Area
 *
 * @author ekardas
 */
public abstract class EurasiaPlane implements Plane {

    /**
     * Returns engine injection of the plane
     * @return Engine injection
     */
    @Override
    public String getEngineInjection(){
        return "Turbofan";
    }

    /**
     * Returns market of the plane
     * @return Market
     */
    @Override
    public String getMarket(){
        return "Eurasia";
    }

    /**
     * Returns seating cover of the plane
     * @return Seating cover
     */
    @Override
    public String getSeatingCover(){
        return "Linen";
    }

    /**
     * Returns information about the plane
     * @return information about the plane
     */
    @Override
    public String toString(){
        return getModel() + "\n" + getPurpose() + "\n" + getMarket() + "\n" + getEngineInjection();
    }



}