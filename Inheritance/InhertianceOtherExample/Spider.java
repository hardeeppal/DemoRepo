package Inheritance.InhertianceOtherExample;

public class Spider extends Insect {
    protected boolean isPoisonous;

    public Spider(int age, boolean isPoisonous) {
        super(age, 4);
        this.isPoisonous = isPoisonous;
    }
    @Override
    public void says() {
        System.out.println("HISSSS");
    }
}
