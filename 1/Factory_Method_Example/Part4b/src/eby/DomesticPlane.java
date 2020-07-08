package eby;

/**
 *  Abstract class to abstract of all production details for Plane in Domestic Area
 *
 * @author ekardas
 */
public abstract class DomesticPlane implements Plane {

    @Override
    public String getEngineInjection(){
        return "Turbojet";
    }
    @Override
    public String getMarket(){
        return "Domestic";
    }
    @Override
    public String getSeatingCover(){
        return "Velvet";
    }

    @Override
    public String toString(){
        return getModel() + "\n" + getPurpose() + "\n" + getMarket() + "\n" + getEngineInjection();
    }

}