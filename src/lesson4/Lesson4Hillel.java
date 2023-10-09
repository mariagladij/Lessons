package lesson4;

public class Lesson4Hillel {
    public static void main(String[] args) {
        // int t = 10;

//        while (t >= 0) {
//            System.out.println("t:" + t--);
//        }
//        do {
//            System.out.println("t:" + t--);
//        } while (t >= 10);

        //for(initialization; condition; iteration) statement;

//        for (int i = 0; i < 10; i++){
//            if (i % 2 == 0)
//                System.out.println("i = " + i);
//            System.out.println("some info");
//        }
//
//        System.out.println("the end");


//        int a = 1, b=2;
//        for (int i = 0; a + b < 10; i++){
//                System.out.println(a++ + b++);
//        }

//        int a = 1, b=2;
//        for (int i = 0; i < 10; i++){
//                if (i == 5) break;
//                if (i % 2 == 0) continue;
//            System.out.println("i = " + i);
//        }

//        int array[][] = {
//                {1,2},
//                {3,4},
//                {5,6}};
//
//        for (int i = 0; i < array.length; i++) {
//            //System.out.println(array[i][0]);
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.println(array[i][j]);
//            }
//        }

        int[][] matrix = new int[10][10];
        int number = 0;
        int sum = 0;

//        0 0 0 0 0 0 0 0 0 0
//        0 1 0 0 0 0 0 0 0 0
//        0 0 2 0 0 0 0 0 0 0
//        0 0 0 3 0 0 0 0 0 0
//        0 0 0 0 4 0 0 0 0 0
//        0 0 0 0 0 5 0 0 0 0
//        0 0 0 0 0 0 6 0 0 0
//        0 0 0 0 0 0 0 7 0 0
//        0 0 0 0 0 0 0 0 8 0
//        0 0 0 0 0 0 0 0 0 9

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    matrix[i][j] = number;
//                    number++;
//
//                }
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // implementation
//
//        System.out.println("The sum of diagonal numbers is: " + sum);

        int array[] = {1,2,3,4};
        for(int i: array) {
            if(i == 3)
            System.out.println(i);
        }

    }


}
