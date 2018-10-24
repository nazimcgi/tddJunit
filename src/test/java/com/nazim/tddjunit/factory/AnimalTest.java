package com.nazim.tddjunit.factory;

import com.nazim.tddjunit.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
	
	@DisplayName("No Design pattern applied")
    @Nested
    
    class OriginalClassesTest{
		private Animal animal1;
		private Animal animal2;
		
		@BeforeEach
        void setUp() {
			animal1= Bird.getInstance();
			animal2= Bear.getInstance();
		}
	
		@Test
	    @DisplayName("Test the Bird class")
	    public void testBird() {
			assertEquals("Hi I'm a bird!", animal1.speak());
		}
	
		@Test
		@DisplayName("Test the Bear class")
		public void testBear() {
			assertEquals("Hi I'm a bear!", animal2.speak());
		} 
	}
	

	@DisplayName("With Factory Design pattern applied")
    @Nested
    
    class FactoryClassesTest{
		private Animal animal1;
		private Animal animal2;
		
		@BeforeEach
        void setUp() {
		
			animal1= AnimalFactory.getAnimal("Bird");
			animal2= AnimalFactory.getAnimal("Bear");
		}
	
		@Test
		@DisplayName("Test the Bird class using the AnimalFactory class")
		public void testBirdFactory() {
			 assertEquals("Hi I'm a bird!", animal1.speak());
		 }
	
		 @Test
		 @DisplayName("Test the Bear class using the AnimalFactory class")
		 public void testBearFactory() {
			 assertEquals("Hi I'm a bear!", animal2.speak());
		 }
	}
	
	
	@DisplayName("With Decorator Design pattern applied")
    @Nested
    
    class DecoratorClassesTest{
		private Animal animal1;
		private Animal animal2;
		
		@BeforeEach
        void setUp() {		
			animal1= new BirdDecorator(Bird.getInstance());
			animal2= new BearDecorator(Bear.getInstance());
		}
	
		 @Test
		 @DisplayName("Test the Bird class using the BirdDecorator class")
		 public void testBirdDecorator() {
			 assertEquals("Hi I'm a bird! and I sing!", animal1.speak());
		 }
		 
		 @Test
		 @DisplayName("Test the Bird class using the BearDecorator class")
		 public void testBearDecorator() {
			 assertEquals("Hi I'm a bear! and I don't sing", animal2.speak());
		 }
	}
}
