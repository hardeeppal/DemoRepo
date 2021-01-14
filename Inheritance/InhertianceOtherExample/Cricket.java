package Inheritance.InhertianceOtherExample;

public class Cricket extends Insect{
    protected double speed;

    public Cricket (double speed) {
        super(31,2);
        this.speed = 149.2;
    }
    @Override
    public void says() {
        System.out.println("THik from cricket class");
    }
    public void jump() {
        System.out.println("Jump high ,It is coming from jump class");
    }
}
