package com.org.main;

public class Matrics {


    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        // Check if the matrices have the same dimensions
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrix dimensions do not match. Cannot perform addition.");
            return;
        }

        // Create a result matrix for storing the sum
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
        	System.out.println("i is : "+i);
            for (int j = 0; j < cols; j++) {
            	System.out.println("j is  :  "+j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println("sum of result[i][j] is : "+result[i][j]);
            }
        }

        // Display the result matrix
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("Sum of Matrices:");
        printMatrix(result);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}