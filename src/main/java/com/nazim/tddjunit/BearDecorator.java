package com.nazim.tddjunit;

public class BearDecorator extends AnimalDecorator{

	public BearDecorator(Animal animalToBeDecorated) {
		super(animalToBeDecorated);
	}
	
	@Override
	public String speak() {	
		return super.speak() + sing();
	}

	private String sing() {
		return " and I don't sing";
	}
}
