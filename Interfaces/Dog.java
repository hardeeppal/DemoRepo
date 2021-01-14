package Interfaces;

public class Dog implements Pet{
    @Override
    public void play() {
        System.out.println("The dog is playing with a ball");
    }
    // These are implemented class may not have a same function but at least  not have exact same function
    // Just they forces to have a these method in a implemented class



}
