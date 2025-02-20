package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

public class RotateImage {
    public void rotateImage(int[][] matrix) 
    {
        transpose(matrix);
        reverseRows(matrix);
    }

        public void swap(int[][] matrix, int r1, int c1, int r2, int c2)
        {
            int temp = matrix[r1][c1];
            matrix[r1][c1]=matrix[r2][c2];
            matrix[r2][c2]=temp;      
        }
        
        public void transpose(int[][] matrix)
        {
            for(int row=0; row<matrix.length; row++)
            {
                for(int col=row; col<matrix[0].length; col++)
                {
                    swap(matrix, row, col, col, row);
                }
            }
        }

        public void reverseRows(int[][] matrix)
        {
            for(int row=0; row<matrix.length; row++)
            {
                int left=0, right=matrix[0].length-1;
                while(left<right)
                {
                    swap(matrix, row, left, row, right);
                    left++;
                    right--;
                }
            }
        }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; ++i) {
            for (int j = 0; j < matrixSize; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        new RotateImage().rotateImage(matrix);
        for (int i = 0; i < matrixSize; ++i) {
            for (int j = 0; j < matrixSize; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

