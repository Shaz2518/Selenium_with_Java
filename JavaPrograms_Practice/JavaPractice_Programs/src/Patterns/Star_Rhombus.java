package Patterns;
import java.util.Scanner;
public class Star_Rhombus {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();
        /*        * * * *
         *     * * * *
            * * * *
         * * * *
         */
        for(int i=rows; i>0; i--)
        {
            for(int j=1; j<i;  j++)
            {
                System.out.print(" " + " ");
            }
            for(int j=rows; j>=1; j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
