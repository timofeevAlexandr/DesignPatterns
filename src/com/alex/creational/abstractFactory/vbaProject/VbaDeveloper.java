package com.alex.creational.abstractFactory.vbaProject;

import com.alex.creational.abstractFactory.Developer;

public class VbaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("VBA developer write code");
    }
}
