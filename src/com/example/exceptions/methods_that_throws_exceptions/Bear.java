package com.example.exceptions.methods_that_throws_exceptions;

public class Bear implements Omnivore{
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        if (amount <= 0) {
            System.out.println("No meat left");
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat");

    }

    @Override
    public void eatPlants(int amount) {
        if (amount <= 0) {
            System.out.println("No plant left");
            throw new NoMorePlantsException();
        }
        System.out.println("Eating plant");

    }
}
