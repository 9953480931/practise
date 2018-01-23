package com;

public class PrintLetter {
public static void main(String[] args) {
	for(Character c = 'A' ; c <='Z' ; c++){
		if(c.equals('A')||c.equals('E')||c.equals('I')||c.equals('O')||c.equals('U')){
			System.out.println(c+" is Vowel ");
		}
		else
			System.out.println(c+" is Consonant ");
			
	}
}
}
