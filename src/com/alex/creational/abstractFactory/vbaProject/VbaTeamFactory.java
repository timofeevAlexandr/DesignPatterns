package com.alex.creational.abstractFactory.vbaProject;

import com.alex.creational.abstractFactory.AbstractTeamFactory;
import com.alex.creational.abstractFactory.Developer;
import com.alex.creational.abstractFactory.ProjectManager;
import com.alex.creational.abstractFactory.Tester;

public class VbaTeamFactory implements AbstractTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new VbaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new VbaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new VbaProjectManager();
    }
}
