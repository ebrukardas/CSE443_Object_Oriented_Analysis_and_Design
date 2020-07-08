package eby;

/**
 * Interface to solution of a system of linear equations
 */
public interface MatrixSolution {

   /**
    * Solution of the system
    *
    * @param matrixValues matrix of the linear equation system
    * @return solved system values
    */
   public Double[][] solveLinearEquation(Double[][] matrixValues);

}
