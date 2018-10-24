package com.nazim.tddjunit;

public abstract class AnimalDecorator extends Animal{
	
	protected Animal animalToBeDecorated; 
	
	public AnimalDecorator(Animal animalToBeDecorated) {
		this.animalToBeDecorated = animalToBeDecorated;
	}
	
	@Override
	public String speak() {
		return animalToBeDecorated.speak();
	}
}
