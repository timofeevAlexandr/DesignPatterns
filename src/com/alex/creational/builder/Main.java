package com.alex.creational.builder;

public class Main {
    public static void main(String[] args) {
        WebSite webSite;

        WebSiteBuilder webSiteBuilder = new WebSiteBuilder(new VisitCardWebSiteBuilder());
        webSite = webSiteBuilder.buildWebSite();
        System.out.println(webSite);
    }
}
