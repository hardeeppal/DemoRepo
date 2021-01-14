package interfacesInJava;

public class InterfaceExample implements Fun {
    public static void main(String[] args) {
        System.out.println();
        InterfaceExample example = new InterfaceExample();
        example.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled up");
    }
}
