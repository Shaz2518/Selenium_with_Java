package Patterns;
import java.util.Scanner;
public class StarTriangle__Increment {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();

        /* 1
         * 1 3
         * 1 3 5
         * 1 3 5 7
         * 1 3 5 7 9
         */
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }

    }
}
