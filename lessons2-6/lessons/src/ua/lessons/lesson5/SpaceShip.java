package ua.lessons.lesson5;

public class SpaceShip {
    public String name;
    public String type;
    public double maxSpeed;
    public Armament armament;

    private String engine;

    public SpaceShip(String name, String type, double maxSpeed, Armament armament) {
        this.name = name;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.armament = armament;

    }

    public void move() {
        System.out.println(this.type + " moves with speed " + this.maxSpeed + " kph ");

    }

    public void attack() {
        System.out.println(this.name + " attacks!!! ");

    }
}
