package com.learning.siri.part5classandobjectbasics.constructors;

public class Car {

    String brandName;
    String modelName;
    double price;

    //No Args Constructor
    //The member variables of the class are initialized with hardcoded values
    //The problem with this constructor is again every object gets created with same values
    public Car() {
        brandName = "SameBrand";
        modelName = "SameModel";
        price = 100000;
    }

    //Constructor with 3 arguments
    // Parameterized constructor
    //We can create many objects each with different values for member variables
    public Car(String brandName, String modelName, double price) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }

    public static void main(String[] args) {
     // All these three objects will have same brandName, modelName,price
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();


        // whereas these two objects will have their own brandName, modelName,price
        Car sCross = new Car("Suzuki", "S-Cross", 100000);
        Car punch = new Car("TATA","Punch",900000);


    }
}
