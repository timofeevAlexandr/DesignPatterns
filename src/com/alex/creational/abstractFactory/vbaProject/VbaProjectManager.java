package com.alex.creational.abstractFactory.vbaProject;

import com.alex.creational.abstractFactory.ProjectManager;

public class VbaProjectManager implements ProjectManager{
    @Override
    public void manage() {
        System.out.println("VBA Project Manager");
    }
}
