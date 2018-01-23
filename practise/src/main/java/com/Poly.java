package com;

class Animal {
	public void move(){
		System.out.println("Animal move");
	}
}

class Bird extends Animal {
	public void move(){
		System.out.println("Bird move");
	}
	
	public void sing(){
		System.out.println("Bird sing");
	}
	
}

public class Poly {
public static void main(String[] args) {
	Animal animal = new Bird();
	animal.move();
	((Bird) animal).sing();
}
}
