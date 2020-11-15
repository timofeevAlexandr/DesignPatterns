package com.alex.creational.factory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getFactoryBySpeciality(DeveloperSpeciality.PHP);
        Developer devepoler = developerFactory.getDeveloper();
        devepoler.writeCode();
    }
    private static DeveloperFactory getFactoryBySpeciality(DeveloperSpeciality developerSpeciality){
        switch (developerSpeciality) {
            case JAVA:
                return new JavaDeveloperFactory();
            case CPLUS:
                return new CPLusDeveloperFactory();
        }
        throw new IllegalArgumentException("Illegal developer speciality: " + developerSpeciality);
    }
}
