package eby;

public class LinearEquationByGauss extends LinearSolverDeluxe{

    public LinearEquationByGauss(){
        method = new GaussianElimination();
    }

    @Override
    public Double[][] solve(Double[][] matrixValues) {
        System.out.println("Gauss Elimination Solution");
        if(method != null)
            return method.solveLinearEquation(matrixValues);
        return null;
    }

}
