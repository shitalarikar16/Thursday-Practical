/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and amethod called "drive". 
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color"
and a method called "Type". Create an object of the Car class and call both the "drive" and "Type" methods.

*/
class Vehicle {
     String brand;
     String model;
     int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("running...");
    }
}

 class Car extends Vehicle {
    private String color="red";

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void type() {
        System.out.println("Type: Car");
    }
	
}


 class UseVehicle3
 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "BMW", 2023, "Red");
        car.drive();
        car.type();
		
    }

 }
 