package com.patterns.Factory.pizzas;

public final class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        this.name = "Pepperoni Pizza";
        this.dough = "Crust";
        this.sauce = "Marinara sauce";
        this.toppings.add("Sliced Pepperoni");
        this.toppings.add("Sliced Onion");
        this.toppings.add("Grated parmesan cheese");
    }
}
