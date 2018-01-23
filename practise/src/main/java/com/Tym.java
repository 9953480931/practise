package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.concurrent.Callable;

public class Tym implements Cloneable{
	String name;
public static void main(String[] args) throws CloneNotSupportedException {
	LocalDate date = LocalDate.now();
	System.out.println(date);
	
	LocalDate dd = LocalDate.of(2017, 12, 11);
	System.out.println(dd.getDayOfWeek());
	System.out.println(DayOfWeek.MONDAY);
	System.out.println(Month.DECEMBER);
	
	Tym tt  = new Tym();
	tt.name="A";
	System.out.println(tt.name);
	Tym tt2 = (Tym) tt.clone();
	tt2.name="B";
	System.out.println(tt2.name);
	System.out.println(tt2);
	System.out.println(tt.name);
	
	
	
}
}
