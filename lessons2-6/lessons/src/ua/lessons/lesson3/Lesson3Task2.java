package ua.lessons.lesson3;

import javax.swing.*;
import java.util.Scanner;

public class Lesson3Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number 'a' = ");
        double a = scan.nextDouble();

        System.out.println("Please enter the number 'b' = ");
        double b = scan.nextDouble();

        System.out.println("Please enter the number 'c' = ");
        double c = scan.nextDouble();

        double descriminant = Math.pow(b,2) - 4 * a * c;

        if (descriminant > 0) {
            double root1 = (-b + Math.sqrt(descriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(descriminant)) / (2 * a);
            System.out.println("відповідь : корінь1 = " + root1 + " і корінь2 = " + root2);
        } else if (descriminant == 0) {
            double root3 = -b / (2 * a);
            System.out.println("відповідь: " + root3);
        } else {
            System.out.println("рівняння не має коренів");
        }
        scan.close();
    }
}
