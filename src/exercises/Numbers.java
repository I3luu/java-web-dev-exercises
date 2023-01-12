package exercises;

import java.util.Scanner;


public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle: ");
        int length = input.nextInt();
        System.out.println("Rectangle length:" + length);

        System.out.println("What is the rectangles width: ");
        int width = input.nextInt();
        System.out.println("Rectangle width:" + width);

        System.out.println("Rectangle area: " + (width * length));

    }
}
