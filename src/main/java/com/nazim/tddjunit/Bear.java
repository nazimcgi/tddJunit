package com.nazim.tddjunit;

public class Bear extends Animal {

	private static Bear instance = null;
	
	private Bear() {};
	
	public static Bear getInstance() {
		if(instance == null)
			instance=new Bear();
		
		return instance;
	}
	
	@Override
	public String speak() {
		return "Hi I'm a bear!";
	}

}
