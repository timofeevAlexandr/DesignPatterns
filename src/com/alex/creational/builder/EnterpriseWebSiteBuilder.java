package com.alex.creational.builder;

public class EnterpriseWebSiteBuilder extends AbstarctWebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprice website");
    }

    @Override
    void buildCmc() {
        webSite.setCmc(CMC.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(5000);
    }
}
