package CreateBlueprint;

public class Animal {
    protected String color;
    protected double speed;
    protected double height;
    protected String sound;

    public Animal(String color, String animalSound) {
        this.color = color;
        this.sound = animalSound;
    }

    public void soundCreated() {
        System.out.println("Sound for animal");
    }
    public boolean isHavingHighSpeed() {
        return true;
    }
}
