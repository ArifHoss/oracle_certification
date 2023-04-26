package com.example.simple_lambda_expressions;

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

        print(animals, (Animal animal) ->{
            return animal.canJump();
        });

        print(animals, (Animal animal) -> {
//            Animal animal = new Animal("Cat", true, false); // not compile
            System.out.println("Checking animal = " + animal.getType());
            return animal.canJump();
        });


        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);
        print(fish, rabbit, (f, r) -> f.canJump() && r.canSwim());
        print(fish, dog, (first, second) -> first.canJump() && second.canSwim());

    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }
    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());
            }
        }
    }
}
