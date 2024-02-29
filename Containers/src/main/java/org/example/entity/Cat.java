package org.example.entity;

import org.example.annotation.Bean;

public class Cat {

    private String model;

    public Cat(String model) {
        this.model = model;
    }

    public Cat() {

    }

    @Bean
    public Cat car() {
        Cat cat = new Cat("british");
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "model='" + model + '\'' +
                '}';
    }
}
