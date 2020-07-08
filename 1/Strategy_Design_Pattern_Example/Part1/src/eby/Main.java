package eby;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        Double[][] m5 = {{1.0,1.0,-3.0,4.0}, {2.0, 1.0, -1.0, 2.0}, {3.0, 2.0, -4.0, 7.0} };
        Double[][] m2 = {{1.0,1.0,-3.0,4.0}, {2.0, 1.0, -1.0, 2.0}, {0.0, 0.0, 0.0, 7.0} };
        Double[][] m3 = {{2.0,-1.0,1.0,1.0}, {3.0, 2.0, -4.0, 4.0}, {-6.0, 3.0, -3.0, 2.0} };
        Double[][] m4 = {{3.0, 2.0,-4.0, 3.0}, {2.0, 3.0, 3.0, 15.0}, {5.0, -3.0, 1.0, 14.0} };
        Double[][] m1 = {{2.0, -1.0, 3.0, 5.0}, {2.0, 2.0, 3.0, 7.0}, {-2.0, 3.0, 0.0, -3.0} };


        Double [][] s1 ;

        for(int i=0; i<m1.length; ++i){//3
            for (int j=0; j<m1[i].length; ++j) {//4
                System.out.print(m1[i][j] + "      ");
            }
            System.out.println(" ");
        }
        LinearSolverDeluxe method = new GaussianElimination();
        s1 = method.solveLinearEquation(m1);
        System.out.println("SOLUTION:");

        for(int i=0; i<s1.length; ++i){//3
            for (int j=0; j<s1[i].length; ++j) {//4
                System.out.print(s1[i][j] + "      ");
            }
            System.out.println(" ");
        }
/*
        ArrayList<Double[][]> arr = new ArrayList<>();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        arr.add(m4);
        arr.add(m5);

        Iterator it = arr.iterator();
        while (it.hasNext()){
            LinearSolverDeluxe method = new GaussianElimination();
            s1 = method.solveLinearEquation((Double[][]) it.next());

            for(int i=0; i<m1.length; ++i){//3
                for (int j=0; j<s1[i].length; ++j) {//4
                    System.out.print(s1[i][j] + "      ");
                }
                System.out.println(" ");
            }
            System.out.println("\n\n");
        }
*/



    }
}
