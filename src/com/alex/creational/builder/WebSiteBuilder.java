package com.alex.creational.builder;

class WebSiteBuilder {

    private AbstarctWebSiteBuilder builder;

    WebSiteBuilder(AbstarctWebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite(){
        builder.buildName();
        builder.buildCmc();
        builder.buildPrice();
        return builder.getWebSite();
    }
}
