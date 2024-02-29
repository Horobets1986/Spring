package org.example;

import org.example.context.ApplicationContext;
import org.example.context.ComponentContainer;
import org.example.entity.dog;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        System.out.println(applicationContext.getBean("cat"));

        ComponentContainer componentContainer = new ComponentContainer();
        System.out.println(componentContainer.getComponent(dog.class));
    }
}