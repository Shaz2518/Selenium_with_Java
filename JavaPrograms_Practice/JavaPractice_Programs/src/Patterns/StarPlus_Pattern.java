package Patterns;

import java.util.Scanner;

public class StarPlus_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();

        /*      *
                *
            * * * * *
                *
                *
         */
        int mid = (rows/2) + 1;
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=rows; j++)
            {
                if(i==mid || j==mid)
                {
                    System.out.print("*" + " ");
                }
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
