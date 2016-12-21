package com.company;

/**
 * Created by vr834 on 12/21/16.
 */
public class MatrixMult {
    public MatrixMult(){}
    public static int[][] mult (int a[][],int b[][]) {
        int x = 0;
        int c[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a[i].length; i++) {
            int o = 0;
            for (int j = 0; j < a[i].length; j++) {
                //System.out.print(a[i][j]+" ");
               // System.out.print(b[j][i]+" ");
                x += a[i][j] * b[j][i];
                System.out.println(a[i][j]);
            }
            //System.out.println(x);

            x = 0;

        }
        return c;
    }

}
