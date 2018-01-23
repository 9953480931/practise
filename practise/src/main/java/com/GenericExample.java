package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class Test<T extends Number> {

	T name;
	Collection<?> al;

   public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	
	public void setList(List< ? super String> l) {
		l.add("");
		this.al = l;
	}
	public Collection<?> getlist(){
		return al;
	}
}



public class GenericExample {
public static void main(String[] args) {
	/*ArrayList<Integer> l = new ArrayList<Integer>();
	
	
	Set<Integer> l2 = new LinkedHashSet<Integer>();
	
	l.add(1);
	l.add(2);
	
	l2.add(10);
	l2.add(20);
	
	System.out.println(l.getClass().getName());
	
	Test<? extends Number> t = new Test<Integer>();
	
	//t.setName("ABC");
	
	t.setList(l);

	
 	System.out.println(l);
	t.setList(l2);
 	System.out.println(l2);*/
	
	Test<? extends Number> t = new Test<Integer>();
	List< ? super String> l = new ArrayList<>();
	
	l.add("");
	t.setList(l);
}
}