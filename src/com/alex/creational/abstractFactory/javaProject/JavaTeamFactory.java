package com.alex.creational.abstractFactory.javaProject;

import com.alex.creational.abstractFactory.AbstractTeamFactory;
import com.alex.creational.abstractFactory.Developer;
import com.alex.creational.abstractFactory.ProjectManager;
import com.alex.creational.abstractFactory.Tester;

public class JavaTeamFactory implements AbstractTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new JavaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new JavaProjectManager();
    }
}
