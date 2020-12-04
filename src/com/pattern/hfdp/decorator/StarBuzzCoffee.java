package com.pattern.hfdp.decorator;
/*
	code from head first design pattern 
	for more reference check head first design pattern
	*/

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();

		System.out.println("beverage1 desc: " + beverage1.getDescription() + " cost: " + beverage1.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);

		System.out.println("beverage2 desc: " + beverage2.getDescription() + " cost: " + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(beverage3);

		System.out.println("beverage3 desc: " + beverage3.getDescription() + " cost: " + beverage3.cost());
	}

}
