package com.alex.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.INSTANCE.addLog("First log \n");
        ProgramLogger.INSTANCE.addLog("Second log \n");
        ProgramLogger.INSTANCE.addLog("Trird log \n");

        ProgramLogger.INSTANCE.showLogInfo();
    }
}
