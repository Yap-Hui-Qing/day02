package cars;

import cars.Car;

public class Main {
    public static void main(String[] args){
        // instantiation 
        // creating an instance of the class by calling the constructor with new
        // myCar is an instance of Car
        Car myCar = new Car(); 
        myCar.setMake("Toyota"); // set the make property 
        myCar.setOwner("Fred");
        myCar.info(); // call a public method on the object

        Car myCar1 = new Car("Toyota"); 
        myCar1.info();

        Car yourCar = new Car(); 
        yourCar.setMake("Nissan");
        yourCar.setOwner("Barney");
        yourCar.info();

        Car ourCar = new Car(); 
        ourCar.setMake("BMW");
        ourCar.setOwner("Wilma");
        ourCar.info();

        // car trailer for 6 cars
        Car[] trailer = new Car[6];
        trailer[1] = myCar;
    }
    
}
