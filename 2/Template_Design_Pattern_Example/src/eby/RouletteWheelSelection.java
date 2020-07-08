package eby;

public class RouletteWheelSelection extends GeneticAlgorithm {

    /**
     */
    @Override
    //  written for example
    public void Select(){
        selected1 = 4;
        selected2= 2;
    }

    public String toString(){
        return "Roulette Wheel Selection\n" + population.toString();
    }

}
