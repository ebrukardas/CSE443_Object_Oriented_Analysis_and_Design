package eby;

public class LinearEquationByMInversion extends LinearSolverDeluxe{

    public LinearEquationByMInversion(){
        method = new MatrixInversion() {
        };
    }

    @Override
    public Double[][] solve(Double[][] matrixValues) {
        System.out.println("Matrix Inversion Solution");
        if(method != null)
            return method.solveLinearEquation(matrixValues);
        return null;
    }
}
