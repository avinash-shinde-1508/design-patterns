package com.techgeeks.creational.factory;

public class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Prepare the chicken burger");
    }
}
