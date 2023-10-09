package ua.lessons.lesson2;

public class Task3 {
    public static void main(String[] args) {

        double L = 10.5;
        double H = 15;
        double V_pyramid;
        double S_base;

        S_base = L * L;
        V_pyramid = (S_base * H) / 3.0;

        System.out.println("volume of a square pyramid is: " + V_pyramid);
        System.out.println("the area of the base of a square pyramid: " + S_base);
    }
}
