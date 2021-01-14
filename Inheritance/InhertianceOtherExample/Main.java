package Inheritance.InhertianceOtherExample;

public class Main {
    public static void main(String[] args) {
        Insect insect1 = new Insect(12,4);
        insect1.says();
        insect1.crawl();
        Cricket cricket1 = new Cricket(149.2);
        cricket1.says();
        cricket1.crawl();
        Spider spider1 = new Spider(2,true);
        spider1.says();

        if (cricket1 instanceof Insect && spider1 instanceof Spider) {
            System.out.println("Cricket is an insect");
        }
    }
}
