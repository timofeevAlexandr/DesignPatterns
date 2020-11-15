package com.alex.creational.singleton;

public enum ProgramLogger {
    INSTANCE;

    private String logInfo = "**LOG INFO** \n";

    public void addLog(String logInfo) {
        this.logInfo += logInfo;
    }

    public void showLogInfo() {
        System.out.println(logInfo);
    }
}
