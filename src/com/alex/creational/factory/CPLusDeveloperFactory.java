package com.alex.creational.factory;

public class CPLusDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new CPlusDeveloper();
    }
}
