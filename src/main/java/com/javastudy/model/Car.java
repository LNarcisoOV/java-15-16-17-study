package com.javastudy.model;

public record Car(String model, String name, Integer size, Double weight){
    
    public int getSizeArea() {
        return this.size() * 3;
    }

}
