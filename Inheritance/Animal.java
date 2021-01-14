package Inheritance;

public class Animal {

    // Extends is used to do inheritance
    // Advantages and Disadvantages
    // minimize duplication of code
    // Superclass and subclass is tightly coupled

    protected String color;
    protected int age;
    protected String name;
    protected double speed;

    // Now am defining constructor here

    public  Animal(String color, int age, String animalName, double speed) {
        this.color = color;
        this.name = animalName;
        this.speed = speed;
        this.age = age;
    }
}
