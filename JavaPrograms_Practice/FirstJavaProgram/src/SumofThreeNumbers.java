import java.util.Scanner;

public class SumofThreeNumbers {
    public static void main(String args[])
    {
        int num1, num2, num3;
        Scanner scr = new Scanner(System.in);
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The sum of three numbers is: " + sum);

    }
}
