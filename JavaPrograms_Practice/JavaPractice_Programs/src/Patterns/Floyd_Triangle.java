package Patterns;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();

        /* 1
         * 2  3
         * 4  5  6
         * 7  8  9  10
         * 11 12 13 14 15
         */
        int count =1;
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
