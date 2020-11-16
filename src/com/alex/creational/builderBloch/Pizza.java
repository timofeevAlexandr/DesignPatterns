package com.alex.creational.builderBloch;

public class Pizza {
    private final int size;
    private final int cheese;
    private final int tomato;
    private final int sausage;
    private final int papper;
    private final int bacon;

    static class Builder{
        private final int size;
        private int cheese = 0;
        private int tomato = 0;
        private int sausage = 0;
        private int papper = 0;
        private int bacon = 0;

        Builder(int size){
            this.size = size;
        }

        Builder setCheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        Builder setTomato(int tomato) {
            this.tomato = tomato;
            return this;
        }

        Builder setSausage(int sausage) {
            this.sausage = sausage;
            return this;
        }

        Builder setPapper(int papper) {
            this.papper = papper;
            return this;
        }

        Builder setBacon(int bacon) {
            this.bacon = bacon;
            return this;
        }

        Pizza build(){
            return new Pizza(this);
        }
    }

    public Pizza build(Builder builder){
        return new Pizza(builder);
    }

    private Pizza(Builder builder){
        size = builder.size;
        cheese = builder.cheese;
        tomato = builder.tomato;
        sausage = builder.sausage;
        papper = builder.papper;
        bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                ", sausage=" + sausage +
                ", papper=" + papper +
                ", bacon=" + bacon +
                '}';
    }
}
