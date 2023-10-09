package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int t = 15;
        int r = 10;

        boolean isPair_t = (t % 2 == 0);
        boolean isPair_r = (r % 2 == 0);

        //System.out.println(isPair);
        System.out.println(isPair_t ? "15 is pair" : "15 is not pair");
        System.out.println(isPair_r ? "10 is pair" : "10 is not pair");
    }
}
