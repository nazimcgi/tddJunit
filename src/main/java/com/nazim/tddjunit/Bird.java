package com.nazim.tddjunit;

public class Bird extends Animal {

	private static Bird instance = null;
	
	private Bird() {};
	
	public static Bird getInstance() {
		if(instance == null)
			instance=new Bird();
		
		return instance;
	}
	
	@Override
	public String speak() {
		return "Hi I'm a bird!";
	}

}
