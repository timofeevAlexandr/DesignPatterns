package com.alex.creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
