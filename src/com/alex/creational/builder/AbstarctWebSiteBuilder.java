package com.alex.creational.builder;

abstract class AbstarctWebSiteBuilder {

    WebSite webSite = new WebSite();

    abstract void buildName();
    abstract void buildCmc();
    abstract void buildPrice();

    WebSite getWebSite(){
        return webSite;
    }

}
