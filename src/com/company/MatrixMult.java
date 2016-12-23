package com.company;

/**
 * Created by vr834 on 12/21/16.
 */
public class MatrixMult {
    public MatrixMult(){}
    public static int[][] mult (int a[][],int b[][]) {
        int x = 0;
        int xc = 0;
        int t = 0;
        int c[][] = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            int o = 0;
            for (int j = 0; j < b[i].length; j++) {
                //System.out.print(a[i][j]+" ");
               // System.out.print(b[j][i]+" ");
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
            //System.out.println(x);

            x = 0;

        }

        return c;
    }

}
