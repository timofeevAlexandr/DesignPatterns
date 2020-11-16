package com.alex.creational.prototype;

public class ProjectFactory{

    private final Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project copy() {
        return (Project) project.copy();
    }
}
