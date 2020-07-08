package eby;

/**
 * Abstract class to abstract of all production details for Plane in Other Area
 *
 * @author ekardas
 */
public abstract class OtherPlane implements Plane {

    @Override
    public String getEngineInjection(){
        return "Geared Turbofan";
    }
    @Override
    public String getMarket(){
        return "Other";
    }
    @Override
    public String getSeatingCover(){
        return "Leather";
    }

    @Override
    public String toString(){
        return getModel() + "\n" + getPurpose() + "\n" + getMarket() + "\n" + getEngineInjection();
    }

}