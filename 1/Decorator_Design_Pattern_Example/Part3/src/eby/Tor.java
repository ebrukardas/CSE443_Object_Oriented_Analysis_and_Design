package eby;

/**
 * Tor type suit with cost and weight
 */
public class Tor implements Suit {

    @Override public int TotalCost(){ return 5000000; }
    @Override public double TotalWeight(){ return 50; }
    @Override public String getDescription(){ return "Tor Suit"; }

}
