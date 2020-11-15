package com.alex.creational.builder;

public class WebSite {

    private String name;
    private CMC cmc;
    private int price;

    void setName(String name) {
        this.name = name;
    }

    void setCmc(CMC cmc) {
        this.cmc = cmc;
    }

    void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", cmc=" + cmc +
                ", price=" + price +
                '}';
    }
}
