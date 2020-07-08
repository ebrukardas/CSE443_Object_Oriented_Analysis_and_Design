package eby;

/**
 * Suit with cost and weight
 */
public interface Suit {

    /**
     * Description of the suit
     * @return Suit description
     */
    public String getDescription();

    /**
     * Total cost of the suit AND accessories
     * @return total cost (TL)
     */
    public int TotalCost();

    /**
     * Total weight of the suit AND accessories
     * @return total weight (kg)
     */
    public double TotalWeight();

}
