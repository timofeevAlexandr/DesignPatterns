package com.alex.creational.abstractFactory.javaProject;

import com.alex.creational.abstractFactory.ProjectManager;

public class JavaProjectManager implements ProjectManager {
    @Override
    public void manage() {
        System.out.println("Java Project Manager");
    }
}
