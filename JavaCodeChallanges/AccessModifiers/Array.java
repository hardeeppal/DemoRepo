package JavaCodeChallanges.AccessModifiers;

public class Array {
    public static void main(String[] args) {
        int[] inputArray = {21, 32, 42, 12, 23,};
        int temp = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print((inputArray[i]) + " ");
        }
    }
}
//    int i,j,temp;
//        for (i = 0;i <random.length;i++) {
//        for (j = 1; j < random.length - 1; j++) {
//        if (random[j] > random[i]) {
//        temp = random[j];
//        random[j] = random[j + 1];
//        temp = random[j + 1];
//        }
//        }