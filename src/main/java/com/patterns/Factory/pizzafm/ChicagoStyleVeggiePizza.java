package com.patterns.Factory.pizzafm;

public final class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Deep Dish Veggie Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
