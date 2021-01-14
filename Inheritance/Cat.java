package Inheritance;

public class Cat extends Animal {
    public Cat(String color, int age, String animalName, double speed) {
        super(color, age, animalName, speed);
    }

    public static void main(String[] args) {

        Animal cat1 = new Animal("Black",23,"Color",43.3);
        System.out.println(cat1.age);
        System.out.println(cat1.speed);
        System.out.println(cat1.color);
    }
}