package ua.lessons.lesson5;

public class Armament {
    public int chargeNumber;

    public String name;

    public Armament(){
        reload();
    }

    public void reload() {
        this.chargeNumber = 5;

    }

    public void shoot(){
        System.out.println("Fire! Charge number = " + --chargeNumber);
    }
}
