package CreateBlueprint;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog1 = new Dog("White","Bark");
        dog1.soundCreated();
        dog1.isHavingHighSpeed();
        System.out.println(dog1.isHavingHighSpeed());
    }

    public Dog(String color, String animalSound) {
        super(color, animalSound);
    }
    @Override
    public void soundCreated () {
        System.out.println("Baauu..!Baauuu");
    }
    @Override
    public boolean isHavingHighSpeed(){
        return false;
    }

}
