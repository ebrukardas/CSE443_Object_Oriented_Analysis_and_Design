package eby;
import java.util.Random;

/**
 * Individual or Chromosome with 2 genes
 */
public class Individual {

    double genes[] = new double[2];
    double fitnessScore;
    int GENE_LENGTH = 2;

    /**
     * Default constructor (generates genes and calculates fitness score)
     */
    public Individual(){
        GenerateGenes();
    }

    /**
     * Sets genes
     * @param genes genes
     */
    public void setGenes(double[] genes) {
        this.genes = genes;
    }

    /**
     * set one gene
     * @param index index of gene
     * @param gene value of gene
     */
    public void setGene(int index, double gene) {
        genes[index] = gene;
    }

    /**
     *
     * @return fitness score
     */
    public double getFitnessScore() {
        return fitnessScore;
    }

    /**
     *
     * @return return genes
     */
    public double[] getGenes() {
        return genes;
    }

    /**
     * Generating 2 genes and calculate its fitness score
     * Their values and summation of the genes are between 0 and 5
     */
    private void GenerateGenes(){
        double x1, x2;
        do {
            x1 = GenerateGen();
            x2 = GenerateGen();
        }while (x1+x2>5);
        genes[0] = x1; genes[1] = x2;
        fitnessScore = ComputeFitnessScore();
    }

    /**
     * Generating genes
     * Its value is between 0 and 5
     * @return genes value
     */
    private double GenerateGen(){
        Random random = new Random(); //start + (random * (end - start));
        double temp = 5 + 5* random.nextDouble();

        while(temp<0 || temp>5){
            //https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range/32808589
            // start + (random * (end - start)) ===>>> 0 + (random.nextDouble() * (5-0))
            temp = 5* random.nextDouble();
            //System.out.println("--->"+temp);
        }
        return temp;
    }

    /**
     * Calculate fitness score according to genes with given function below
     * f(x1,x2) = 20*x1*x2 + 16*x2 - 2*(x1^2) - x2^2 - (x1+x2)^2
     * @return Chromosome's fitness score
     */
    public double ComputeFitnessScore(){
        return (18*genes[0]*genes[1]) + (16 * genes[1]) - ((3*genes[0]*genes[0])+(2*genes[1]*genes[1]));
    }

    /**
     * Information about individual
     * @return information of the individual
     */
    public String toString(){
        return "Fitness Score: " + fitnessScore + "\tGene1:" + genes[0] + "\tGene2:" + genes[1];
    }

}
