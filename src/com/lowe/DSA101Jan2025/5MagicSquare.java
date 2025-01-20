package com.lowe.DSA101Jan2025;

import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
        int sumd1=0, sumd2=0;
        for(int i=0; i<n; i++){
            sumd1+=grid[i][i];
            sumd2+=grid[i][n-i-1];
        }
        if(sumd1!=sumd2){
            return "No";
        }
        for(int i=0; i<n; i++){
            int rowsum=0, colsum=0;
            for(int j=0; j<n ;j++){
                rowsum += grid[i][j];
                colsum += grid[j][i];
            }
            if(rowsum != colsum || colsum!= sumd1)
            {
            return "No";
            }
        }
        return "Yes";
    }
}

