package com.example.exceptions.methods_that_throws_exceptions;

public interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}
