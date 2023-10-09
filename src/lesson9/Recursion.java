package lesson9;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    // 5! = 5*4*3*2*1
    // 0! = 1


    //factorial(5) = 5* fac(4) = 4* fac(3) -- fac(3) = 3* fac(2) --> fac(2) = 2 * fac(1) --> fac(1)=1

    public static int factorial(int x) {
        if (x<=1) return 1;

        return x * factorial(x-1);

    }
}


//recursion(3) -> recursion(2) -> recursion(1) -> recursion(0) - return
//    public static void recursion(int n) {
//        if (n == 0) return;
//
//        System.out.println("+");
//        recursion(n-1);
//    }