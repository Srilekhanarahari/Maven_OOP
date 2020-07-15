package com.epam.maven_oop;

public class GulabJam extends Sweet implements NewYearGift{
	GulabJam(int weight, int price) {
		super(weight, price);
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
}