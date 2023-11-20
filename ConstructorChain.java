package org.main.practice;

public class ConstructorChain {

	
	    private int number;
	    private String text;

	    // Default constructor
	    public ConstructorChain() {
	        // Call the parameterized constructor with default values
	        this(0, "Default");
	    }

	    // Parameterized constructor
	    public ConstructorChain(int number, String text) {
	        this.number = number;
	        this.text = text;
	    }

	    public void display() {
	        System.out.println("Number: " + number);
	        System.out.println("Text: " + text);
	    }

	    public static void main(String[] args) {
	    	ConstructorChain obj1 = new ConstructorChain();
	    	ConstructorChain obj2 = new ConstructorChain(42, "Custom Text");

	        obj1.display();
	        obj2.display();
	    }
	}


