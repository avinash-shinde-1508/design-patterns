package com.techgeeks.creational.prototype;

public class Truck implements Vehicle{
    public Truck(Truck truck){
        // copy all the values
    }
    @Override
    public Vehicle vehicleClone() {
        return new Truck(this);
    }
}
