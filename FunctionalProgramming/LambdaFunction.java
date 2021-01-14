package FunctionalProgramming;

public class LambdaFunction {
    public static void main(String[] args) {
        // They are anomonous  fucntion Need quick function of code
        // here we not need public static but have parameters that return void
        //
        // body of code after return
        Answerable phone = () -> {
            return "Hello";
        };
        System.out.println(phone.answer());
//        Predicate isOdd = n -> n % 2 ! = 0;
//        System.out.println(isOdd.test(2));

        Predicate isEven = n -> n % 2 == 0;
        // n is input and body after
    }
}
