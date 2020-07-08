package eby;

/**
 * Dec type suit with cost and weight
 */
public class Dec implements Suit {

    @Override public int TotalCost(){ return 500000;}
    @Override public double TotalWeight(){ return 25; }
    @Override public String getDescription(){ return "Dec Suit"; }

}
