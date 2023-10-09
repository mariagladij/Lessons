package ua.lessons.lesson4;

public class Lesson4Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int a = array.length + 1;
        int expectedSum = (a * (a + 1)) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number in array is : " + missingNumber);
    }
}