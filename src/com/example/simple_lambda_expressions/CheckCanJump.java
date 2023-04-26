package com.example.lambdaExpression;

public class CheckCanJump implements CheckAnimal{
    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}
