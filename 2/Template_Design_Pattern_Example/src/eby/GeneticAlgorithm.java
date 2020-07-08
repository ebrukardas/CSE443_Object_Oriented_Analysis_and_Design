package eby;

import java.util.Random;

public abstract class GeneticAlgorithm {

    protected Population population;
    protected int selected1;
    protected int selected2;

    /**
     * apply algorithm
     */
    public void Apply(){

        population = new Population(5);         //GeneratePopulation();

        System.out.println(population);
        //ComputeFitness();
        for (int i=0; i<100; ++i){
            Select(); // template method
            Crossover();
            //Mutation();
            System.out.println(population);

            population.ComputeFitnessScore();
        }

    }

    /**
     * Template (abstract) class to do selection from the population
     */
    public abstract void Select();

    /**
     *  Take a crossover point randomly and swap genes
     */
    public void Crossover(){
        Random random = new Random();
        // start + (random * (end - start))
        int crossoverPoint = (int) (random.nextDouble() * 2);
        System.out.println("Crossover: " + crossoverPoint);
        population.SwapGenes(selected1, selected2, crossoverPoint);
    }

    /**
     * Mutation of the genes
     */
    public void Mutation(){
        throw new UnsupportedOperationException();
    }


    public String toString(){
        return population.toString();
    }
}