package com.alex.creational.abstractFactory;

public interface AbstractTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
