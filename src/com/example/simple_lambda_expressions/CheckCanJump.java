package com.example.simple_lambda_expressions;

public class CheckCanJump implements CheckAnimal{
    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}
