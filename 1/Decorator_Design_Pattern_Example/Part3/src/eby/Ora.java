package eby;

/**
 * Ora type suit with cost and weight
 */
public class Ora implements Suit{

    @Override public int TotalCost(){ return 1500000; }
    @Override public double TotalWeight(){ return 30 ;}
    @Override public String getDescription(){ return "Ora Suit"; }

}
