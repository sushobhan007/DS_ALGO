package org.example.arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] multiArray = {{1, 3, 9}, {5, 8, 7}, {2, 4, 6}};
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int[] anArray : multiArray) {
            boolean is1stAdded = false;
            for (int i = 0; i < anArray.length; i++) {
                if (!is1stAdded) {
                    sum1 += anArray[count];
                    is1stAdded = true;
                }
            }
            boolean is2ndAdded = false;
            for (int i = 0; i < anArray.length; i++) {
                if (!is2ndAdded) {
                    sum2 += anArray[anArray.length - 1 - count];
                    is2ndAdded = true;
                }
            }
            count++;
        }
        System.out.println("diagonalSum = " + (sum1 + sum2));
    }
}
