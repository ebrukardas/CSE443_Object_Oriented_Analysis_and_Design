package eby;

public class RankSelection extends GeneticAlgorithm {

    /**
     */
    @Override
    //  written for example
    public void Select(){
        selected1 = 4;
        selected2= 2;
    }

    public String toString(){
        return "Rank Selection\n" + population.toString();
    }
}
