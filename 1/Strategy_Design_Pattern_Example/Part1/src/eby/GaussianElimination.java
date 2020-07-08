package eby;

/**
 * Gauss Elimination method to solve equation
 *
 * @author ekardas
 */
public class GaussianElimination implements LinearSolverDeluxe {

    private int rowNum = 0;
    private int columnNum = 0;

    @Override
    public Double[][] solveLinearEquation(Double[][] matrixValues){

        rowNum = matrixValues.length;
        columnNum = matrixValues[0].length ;


        // if matrix is non-singular
        Double[][] m = reduceMatrix(matrixValues);

        return m;
    }


    /**
     * Reduce matrix and apply Gauss
     * @param matrixValues system of linear equation as a matrix
     * @return solved matrix
     */
    private Double[][] reduceMatrix(Double[][] matrixValues){

        for(int counter = 0; counter<rowNum; ++counter) {
            if(matrixValues[counter][counter] != 1){
                matrixValues[counter] = pivot(matrixValues[counter]);
            }

            //reduce matrix
            for (int row = counter + 1; row < rowNum; ++row) {
                Double x = -(matrixValues[row][counter]);
                for (int column = 0; column < columnNum; ++column)
                    matrixValues[row][column] = round(x * matrixValues[counter][column] + matrixValues[row][column]);

            }

        }

        if(matrixValues[rowNum-1][columnNum-2] == 0 && matrixValues[rowNum-1][columnNum-1] != 0)
            System.err.println("Matrix has no solution! (last row)");

        return matrixValues;
    }

    /**
     * Finding pivot number and reduce to one
     *
     * @param matrixValues row to find and reduce the pivot
     * @return pivoted row
     */
    private Double[] pivot(Double[] matrixValues){
        Double var = 1.0;
        for (int i=0; i<matrixValues.length-1; ++i){
            var = matrixValues[i];
            if(var != 0.0)
                break;
        }
        for (int i=0; i<matrixValues.length; ++i){
            matrixValues[i]  = round(matrixValues[i] / var);
        }
        return matrixValues;
    }

    /**
     * Rounding the double to .2
     *
     * @param d double number to round (1.666666666 to 1.66)
     * @return rounded double
     */
    private double round(double d){
        d *= 100;
        int in = (int) d;
        d = (double)in /100;
        return d;
    }

    /**
     * Prints matrix
     *
     * @param matrixValues matrix to print
     */
    public void printMatrix(Double[][] matrixValues){
        for(int i=0; i<rowNum; ++i){//3
            for (int j=0; j<columnNum; ++j) {//4
                System.out.print(matrixValues[i][j] + "      ");
            }
            System.out.println(" ");
        }
    }

}