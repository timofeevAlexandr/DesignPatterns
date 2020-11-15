package com.alex.creational.abstractFactory.javaProject;

import com.alex.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
