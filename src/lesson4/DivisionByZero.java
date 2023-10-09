package lesson4;

public class DivisionByZero {
    public static void main(String[] args) {
        //int result1 = 100 / 0;
        //int result2 = 0 / 0;

        float floatResult = 100f / 0;
        System.out.println("100f / 0 = " + floatResult);

        int floatToIntResult = (int) floatResult;
        System.out.println("Cast float to int = " + floatToIntResult);
        System.out.println("\n");

        floatResult = -100f / 0;
        System.out.println("-100f / 0 = " + floatResult);

        floatToIntResult = (int) floatResult;
        System.out.println("Cast float to int = " + floatToIntResult);
        System.out.println("\n");

    }
}
