package com.alex.creational.builder;

class VisitCardWebSiteBuilder extends AbstarctWebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit card site");
    }

    @Override
    void buildCmc() {
        webSite.setCmc(CMC.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(100);
    }
}
