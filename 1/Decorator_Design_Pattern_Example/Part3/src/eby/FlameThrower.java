package eby;

/**
 * Accessory (Flame Thrower) to added to the suit
 */
public class FlameThrower extends Accessories {

    /**
     * Accessory to the suit
     * @param suit Suit to be added accessory
     */
    public FlameThrower(Suit suit){ this.suit = suit; }

    @Override public int TotalCost(){ return suit.TotalCost() + 50000;  }
    @Override public double TotalWeight(){ return suit.TotalWeight() + 2; }
    @Override public String getDescription(){ return suit.getDescription() + ", Flame Thrower"; }

}
