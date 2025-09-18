public class Car {
    private String model;
    private int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(year + " " + model + " is starting...");
    }

    public void stop() {
        System.out.println(year + " " + model + " is stopping...");
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Honda Civic", 2022);

        myCar.displayInfo();
        myCar.start();
        myCar.stop();
    }
}
