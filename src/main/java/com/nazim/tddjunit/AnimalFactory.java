package com.nazim.tddjunit;


public class AnimalFactory {

	public static Animal getAnimal(String race) {
		
		if("BIRD".equalsIgnoreCase(race))
			return Bird.getInstance();
		
		else if ("BEAR".equalsIgnoreCase(race))
			return Bear.getInstance();
		
		return null;
		
	}
}
