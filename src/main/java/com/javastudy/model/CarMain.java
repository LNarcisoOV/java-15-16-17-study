package com.javastudy.model;

public class CarMain {

    public static void main(String...strings) {
        Car car = new Car("zzz-500", "Ferrari", 5, 2.2);
        

        System.out.println(car.toString());
        System.out.println(car.getSizeArea());
        
        instanceOfPatternMatch(car);
        switchPatternMatch(car);
    }

    private static void instanceOfPatternMatch(Car car) {
        if(car.name() instanceof String name && !name.isEmpty()) {
            System.out.println(car.name());
        }
    }

    private static void switchPatternMatch(Object object) {
//        String result = switch(object) {
//            case null -> "Null value received";
//            case Integer i -> "Integer value received: " + i;
//            case String s -> "String value received: " + s;
//            default -> "None of the types";
//        };
//        
//        System.out.println("Switch pattern match: " + result);
    }
}
