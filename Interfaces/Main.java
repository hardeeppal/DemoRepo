package Interfaces;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        if (dog1 instanceof Pet) {
            dog1.play();
        }
        if (cat1 instanceof Cat) {
            cat1.play();
        }
    }
}
