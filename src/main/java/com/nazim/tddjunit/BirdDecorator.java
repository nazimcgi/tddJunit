package com.nazim.tddjunit;

public class BirdDecorator extends AnimalDecorator{

	public BirdDecorator(Animal animalToBeDecorated) {
		super(animalToBeDecorated);
	}
	
	public String speak() {	
		return (super.speak() + sing());
	}

	private String sing() {
		return " and I sing!";
	}

}
