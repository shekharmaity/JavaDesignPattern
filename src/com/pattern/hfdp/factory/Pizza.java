package com.pattern.hfdp.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;

	List<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding topping ...");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
	};

	void bake() {
	};

	void cut() {
	};

	void box() {
	}

	public String getName() {
		return name;
	}

}
