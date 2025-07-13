package Patterns;

import java.util.Scanner;

public class StarCross_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter rows. Rows should be odd");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();

        /* *        *
         *   *    *
         *     *
         *   *    *
         * *         *
         */
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=rows; j++)
            {
                if(i==j || (i+j)==rows+1)
                System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
