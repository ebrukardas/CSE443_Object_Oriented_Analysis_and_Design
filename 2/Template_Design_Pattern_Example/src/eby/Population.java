package eby;

/**
 * Population of the chromosomes
 */
public class Population {

    Individual[] population;
    private int indivNum;

    /**
     * Creation of the population
     * @param indiNum individual number
     */
    public Population(int indiNum){
         population= new Individual[indiNum];
         this.indivNum = indiNum;

        for (int i = 0; i < indiNum; i++) {
            population[i] = new Individual();
        }
    }

    /**
     * Compute the fitness score of the population
     */
    public void ComputeFitnessScore(){
        for (int i=0; i<population.length; ++i){
            population[i].ComputeFitnessScore();
        }
    }

    /**
     * Swap genes of the selected choromosomes
     * @param select1 chromosome 1
     * @param select2 chromosome 2
     * @param crossoverPoint random crossover point
     */
    public void SwapGenes(int select1, int select2, int crossoverPoint){
        if(crossoverPoint == 0){
            double temp = population[select1].getGenes()[0];
            population[select1].setGene(0, population[select2].getGenes()[0]);
            population[select2].setGene(0, temp);
        }else {
            double[] temp = population[select1].getGenes();
            population[select1].setGenes(population[select2].getGenes());
            population[select2].setGenes(temp);
        }
    }

    /**
     * Information about Population
     * @return information of the members of the population
     */
    public String toString(){
        String str = "";
        for (int i=0; i<indivNum; ++i){
            str += ((i) + " " + population[i] + "\n");
        }
        return str;
    }
}
