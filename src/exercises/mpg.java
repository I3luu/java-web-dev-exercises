package exercises;

import java.util.Scanner;
public class mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?: ");
        double miles = input.nextDouble();
        System.out.println("Distance: " + miles);

        System.out.println("How much gas did you use?: ");
        double gas = input.nextDouble();
        System.out.println("Gas consumed: " + gas);

        double mpg = miles / gas;

        System.out.println("you are running on " + mpg + "mpg.");
    }
}
