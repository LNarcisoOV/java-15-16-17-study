package com.javastudy.model;

public class CarMain {

    public static void main(String...strings) {
        Car car = new Car("zzz-500", "Ferrari", 5, 2.2);
        

        System.out.println(car.toString());
        System.out.println(car.getSizeArea());
        
        if(car.name() instanceof String name && !name.isEmpty()) {
            System.out.println(car.name());
        }
    }
}
