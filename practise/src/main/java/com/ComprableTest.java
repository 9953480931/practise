package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
	int age;
	String name;
	
	public Person(int age,String name) {
		this.age =age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return (-1)*this.getName().compareTo(o.getName());
	}
	
	
}

class NameComprator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class ReverseNameComprator implements Comparator<Person>{

@Override
public int compare(Person o1, Person o2) {
	return -1*o1.getName().compareTo(o2.getName());
}

}

public class ComprableTest {
public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
	
	list.add(new Person(10,"A"));
	list.add(new Person(1,"B"));
	list.add(new Person(5,"D"));
	list.add(new Person(9,"C"));
	
	System.out.println("Before Sorting"+list);
	
	//Comparator<Person> byName = (Person o1,Person o2) -> o1.getName().compareTo(o2.getName());
	
	//Collections.sort(list, new NameComprator());
	Collections.sort(list);

	System.out.println("After Sorting"+list);
}
}
