package eby;

/**
 * Accessory (Auto Rifle) to added to the suit
 */
public class AutoRifle extends Accessories{

    /**
     * Accessory to the suit
     * @param suit Suit to be added accessory
     */
    public AutoRifle(Suit suit){ this.suit = suit; }

    @Override public int TotalCost(){ return suit.TotalCost() + 30000;  }
    @Override public double TotalWeight(){ return suit.TotalWeight() + 1.5; }
    @Override public String getDescription(){ return suit.getDescription() + ", Auto Rifle"; }

}
