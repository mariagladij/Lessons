package lesson3;

import java.util.Scanner;

public class Lesson3Hillel {
    public static void main(String[] args) {

//        byte b = 50;
//        char c = 700;
//        short s = 200;
//        int i = 257;
//        long l = 8888888L;
//        float f = 0.8F;
//        double d = 325.43634636;

        //int res = i + b;
        //byte res = (byte)(b+i);
        //System.out.println(res);
//        int res = (int) (d + i);
//        System.out.println("Cast int to byte " + res);
//        byte res = (byte) (d + b);
//        System.out.println("Double  to byte " + res);
//        double res = (f + b) + (i / c) + (d - s);
//        System.out.println(res);

//        //arrays
//
//        int month[];
//        int[] month2;
//        month = new int[12];
//        month[0] = 1;
//        month[1] = 2;
//        month[2] = 3;
//        month[3] = 4;
//        month[4] = 5;

        //System.out.println(month[3]);
        //System.out.println(month.length);

//        month2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        month2[12] = 111;
//        System.out.println(month2[12]);
//
//        month2 = new int[]{213,34,24,35235,23523523,5,35,25,25,23};
//        System.out.println(month2[]);

        //Multidimensional
//        int[][] twoDimArr = new int[3][4];
//
//        twoDimArr = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        System.out.println(twoDimArr[2][1]);


        //if-else
//
//        int a = 3, b = 3, c=1;
//
//        if (a == b) {
//            System.out.println("ok");
//            System.out.println("ok");
//            System.out.println("ok");
//        }
//        else System.out.println("99999");

        //else statement2;

//        boolean isBannerPresent = true;
//
//        if(isBannerPresent) System.out.println("accept all");
//
//        boolean loginFilled = false, pwdFilled = true;
//        boolean rememberMe = true;
//
//        if (loginFilled && pwdFilled) {
//            if (rememberMe) System.out.println("OK");
//            else System.out.println("it is a pity");
//
//        }
//            System.out.println("submit button active");
//        else if (pwdFilled) {
//            System.out.println("fill the pwd!!");
//        }
//        else System.out.println("do anything!");


        //switch

//        int autumnMonth = 2;
//        switch (autumnMonth) {
//            case 1:
//                System.out.println("september");
//                break;
//            case 2:
//                System.out.println("october");
//                break;
//            case 3:
//                System.out.println("november");
//                break;
//            default:
//                System.out.println("out of scope");
//        }

        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the number");
//        int i = scan.nextInt();
//        System.out.println("your number is " +i);


//        scan.nextInt();
//        scan.nextLine();

        System.out.println("enter the string");
        String s = scan.nextLine();
        System.out.println("string " +s);


    }
}
