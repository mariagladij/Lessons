package ua.lessons.lesson4;

import java.util.Scanner;

public class Lesson4Task4 {
    public static void main(String[] args) {
        final String correctPassword = "12345";
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password: ");
            String userEnter = scan.nextLine();

            if (userEnter.equals(correctPassword)) {
                System.out.println("Password accepted! Login is allowed.");
                break;
            } else {
                System.out.println("Password incorrect!!! Please try again. ");
            }
        }
    }
}
