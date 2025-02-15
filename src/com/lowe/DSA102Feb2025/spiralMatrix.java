package com.lowe.DSA102Feb2025;

import java.util.*;

class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int A) {
        int [][] matrix = new int[A][A];
        int i=1;
        int sr=0, er=A-1, sc=0, ec=A-1;
        while(i<=A*A){
            for(int col=sc; col<=ec; col++){
                matrix[sr][col]=i++;
            }
            sr++;
            for(int row = sr; row<=er; row++){
                matrix[row][ec]=i++;
            }
            ec--;
            for(int col=ec; col>=sc; col--){
                matrix[er][col]=i++;
            }
            er--;
            for(int row=er; row>=sr; row--){
                matrix[row][sc]=i++;
            }
            sc++;
        }
        return matrix;
    }
}

