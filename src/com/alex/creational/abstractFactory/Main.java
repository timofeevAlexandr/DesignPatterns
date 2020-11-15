package com.alex.creational.abstractFactory;

import com.alex.creational.abstractFactory.javaProject.JavaTeamFactory;

public class Main {
    public static void main(String[] args) {
        AbstractTeamFactory teamFactory = new JavaTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manage();
    }
}
