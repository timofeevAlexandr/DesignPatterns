package com.alex.creational.prototype;

public class Project implements Copyble{
    private final int id;
    private final String name;
    private final String sourceCode;

    public Project(int id, String name, String sourceCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        return new Project(id, name, sourceCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
