package com.example.exceptions.methods_that_throws_exceptions;

public class MethodsWithExceptions {
    public static void main(String[] args) throws NoMoreMeatException {
        Bear bear = new Bear();
        try {
            bear.eatPlants(1);
            bear.eatMeat(2);
        }catch (NoMorePlantsException p) {
            p.printStackTrace();
            System.out.println("No plants");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Runtime");
        } catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear i hungry");
        } finally {
            System.out.println("Finally");
        }
        bear.eatPlants(+2);
    }
}
