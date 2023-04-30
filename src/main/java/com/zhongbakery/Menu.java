package com.zhongbakery;

public class Menu {

    private Bakery[] bakeries;

    public Menu(Bakery[] bakeries) {
        this.bakeries = bakeries;
    }

    public Bakery selectBakery(String name) {

        for(Bakery bakery: this.bakeries) {
            if(bakery.name.equals(name)) {
               return bakery;
            }
        }
        return null;
    }
}