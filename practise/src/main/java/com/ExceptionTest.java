package com;

public class ExceptionTest {
public static void main(String[] args) {
	int result=0;
	try{
	result=5/0;
	}
	catch (Exception e) {
	 throw new ArithmeticException(); 
	}
	System.out.println("after exception is thrown");
	
	System.out.println(result);
}
}
