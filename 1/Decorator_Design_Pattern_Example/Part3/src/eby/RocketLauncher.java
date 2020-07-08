package eby;

/**
 * Accessory (Rocket Launcher) to added to the suit
 */
public class RocketLauncher extends Accessories {

    /**
     * Accessory to the suit
     * @param suit Suit to be added accessory
     */
    public RocketLauncher(Suit suit){ this.suit = suit; }

    @Override public int TotalCost(){ return suit.TotalCost() + 150000;  }
    @Override public double TotalWeight(){ return suit.TotalWeight() + 7.5; }
    @Override public String getDescription(){ return suit.getDescription() + ", Rocket Launcher"; }
}
