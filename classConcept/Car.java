package classConcept;


// Data types;
// int --> integer 1,2,3
// double --> decimal 34.5,32.1
// String --> "ala2" or "Hello World"
public class Car {
    double myCarSpeed = 50;
    public static void main(String[] args) {
        Car car1 = new Car(242, "KAINTH", "Black", true);
        Car car = new Car(232, "ATTWADDI", "WHITE", false);
        System.out.println("This is car one number Plate:" + car.licensePlate);
        System.out.println("This is car two number " + car1.licensePlate + " This is car 2 " + car.color);
        System.out.println("The car speed is : " + car1.myCarSpeed);
    }
    public double speedingUp(double currentSpeed) {
        currentSpeed = currentSpeed + 100;
        return currentSpeed;
    }

    protected int averageMilesPerGallon;
    protected String licensePlate;
    protected String color;
    boolean areTailingWorking;

    public Car(int inputAverageMPG, String inputLicencePlate, String inputPaintColor, boolean isTailingWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicencePlate;
        this.color = inputPaintColor;
        this.areTailingWorking = isTailingWorking;

    }
}
