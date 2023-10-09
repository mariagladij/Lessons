package lesson4;

import java.util.Scanner;

public class Lesson4Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("program will not stop until you will enter =0=");

        while (true) {
            System.out.println("Please enter the number = ");
            int number = scan.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }
        System.out.println("The sum of the entered numbers : " + sum);
    }
}
