package com.alex.creational.builderBloch;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(50).setCheese(10).setBacon(50).setTomato(20).build();
        System.out.println(pizza);
    }
}
