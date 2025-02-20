package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] col = new boolean[n];

        for(int r=0; r<m; r++)
        {
            for(int c=0; c<n; c++)
            {
                if(matrix[r][c]==0)
                {
                    rows[r]=col[c]=true;
                }
            }
        }

        for(int r=0; r<m; r++)
        {
            for(int c=0; c<n; c++)
            {
                if(rows[r]==true||col[c]==true)
                {
                    matrix[r][c]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
