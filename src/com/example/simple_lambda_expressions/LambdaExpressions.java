package com.example.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author arif on 2023-04-18
 */


public class LambdaExpressions {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Dog", true, true));

        print(animals, new CheckCanJump());
        print(animals, animal -> animal.canSwim());
        print(animals, animal -> !animal.canJump());

    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }
    }
}
