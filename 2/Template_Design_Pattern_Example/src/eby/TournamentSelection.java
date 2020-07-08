package eby;

public class TournamentSelection extends GeneticAlgorithm {

    /**
     */
    @Override
    //  written for example
    public void Select(){
        selected1 = 4;
        selected2= 2;
    }
    public String toString(){
        return "Tournament Selection\n" + population.toString();
    }
}
