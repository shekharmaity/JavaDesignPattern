package com.pattern.hfdp.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish cheese pizza";
		dough = "Extra Thin crust Dough";
		sauce = "Plum Tomato sauce";

		toppings.add("shredded Mozzarella Cheese");
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices.");
	}

}
