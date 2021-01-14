package CashPoolConcept;

public class CashPool {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        // Only till 127 cash pool have your memory stored
        // After they do not have their memory location stored
    }
}