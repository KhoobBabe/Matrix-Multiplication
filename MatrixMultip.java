package com.khubaib;

import java.util.Scanner;

public class MatrixMultip {

    public static void main(String[] args) {

        //declaring input variable
        Scanner input = new Scanner(System.in);

        //declaring the number of rows and columns
        int rows = 3;
        int columns = 3;

        //declaring the two matrices
        int matrix_1[][]=new int[rows][columns];
        int matrix_2[][]=new int[rows][columns];

        System.out.println("FOR THE FIRST MATRIX");
        System.out.println();

        int a = 1;

        //taking the inputs for the first matrix
        for (int row=0; row<3; row++){
            for (int col = 0; col<3; col++){

                System.out.print("Enter the entry "+ a +" : ");
                matrix_1[row][col]= input.nextInt();

                a++;

            }
        }

        System.out.println();

        int b = 1;
        //taking the inputs for the second matrix
        System.out.println("FOR THE SECOND MATRIX");
        System.out.println();
        for (int row=0; row<3; row++){
            for (int col = 0; col<3; col++){

                System.out.print("Enter the entry "+b+" : ");
                matrix_2[row][col]= input.nextInt();

                b++;
            }
        }

        /* Mutliplying Two matrices by multiplying the element from the row of one matrix to the element
         *from the element from the column of the other matrix adding them
         */
        int[][] product = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < columns; k++) {
                    product[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
        }

        System.out.println();
        // Displaying the result
        System.out.println("PRODUCT OF TWO MATRICES IS: ");
        System.out.println();
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }


}

