package ua.lessons.lesson3;

import java.util.Scanner;

public class Lesson3Task3 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter the year of birth: ");
        int yearOfBirth = scan2.nextInt();

        if ((yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0) || yearOfBirth % 400 == 0)
            System.out.println(yearOfBirth + " високосний рік");
        else
            System.out.println(yearOfBirth + " не високосний рік");

        scan2.close();
    }
}
