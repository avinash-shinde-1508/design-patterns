package com.techgeeks.creational.prototype;

public class Bus implements Vehicle{

    public Bus(Bus bus){
        // copy constructor
    }
    @Override
    public Vehicle vehicleClone() {
        return new Bus(this);
    }
}
