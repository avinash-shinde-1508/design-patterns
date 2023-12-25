package com.techgeeks.creational.prototype;

public class Car implements Vehicle {
    public Car(Car car){
        // copy constructor
    }
    @Override
    public Vehicle vehicleClone() {
        return new Car(this);
    }
}
