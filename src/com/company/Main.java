package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
        int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
        int v[][] = MatrixMult.mult(a,b);
        for(int i[]:v){
            for(int k:i){
                System.out.print(k+ " ");
            }
            System.out.println(" ");
        }
    }
}
