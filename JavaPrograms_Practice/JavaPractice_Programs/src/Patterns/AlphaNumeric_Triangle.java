package Patterns;

import java.util.Scanner;

public class AlphaNumeric_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();

        /* 1
         * A B
         * 1 2 3
         * A B C D
         * 1 2 3 4 5
         */
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i%2!=0)
                {
                    System.out.print(j + " ");
                }
                else System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
