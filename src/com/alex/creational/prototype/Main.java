package com.alex.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Project mainProject = new Project(1,"Main project", "Code");

        ProjectFactory projectFactory = new ProjectFactory(mainProject);
        Project cloneProject = projectFactory.copy();

        System.out.println(mainProject);
        System.out.println(cloneProject);
    }
}
