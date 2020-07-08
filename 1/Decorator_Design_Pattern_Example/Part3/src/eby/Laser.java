package eby;

/**
 * Accessory (Rocket Launcher) to added to the suit
 */
public class Laser extends Accessories{

    /**
     * Accessory to the suit
     * @param suit Suit to be added accessory
     */
    public Laser(Suit suit){ this.suit = suit; }

    @Override public int TotalCost(){ return suit.TotalCost() + 200000;  }
    @Override public double TotalWeight(){ return suit.TotalWeight() + 5.5; }
    @Override public String getDescription(){ return suit.getDescription() + ", Laser"; }
}
