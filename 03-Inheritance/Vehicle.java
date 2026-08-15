
class Vehicle {

    String brand;
    String color;

    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Black", 1500000);

        c1.start();
        c1.drive();

        System.out.println("\nCar Details:");

        c1.displayDetails();
    }
}


class Car extends Vehicle {

    double price;

    Car(String brand, String color, double price) {

        super(brand, color);
        this.price = price;
    }

    void drive() {
        System.out.println("Car is driving");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
