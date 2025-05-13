import java.util.Scanner;

public class Percentage {
    public static void main (String args[])
    {
        double sub1, sub2, sub3, sub4, sub5;
        double percent;
        System.out.println(" Enter marks for 5 subject out of 100");
        Scanner scr = new Scanner (System.in);
        sub1 = scr.nextDouble();
        sub2 = scr.nextDouble();
        sub3 = scr.nextDouble();
        sub4 = scr.nextDouble();
        sub5 = scr.nextDouble();

        double sum = sub1 + sub2 + sub3 + sub4 + sub5;
        percent = (sum/500) * 100;

        System.out.println("Percentage is : " + percent);
    }
}
