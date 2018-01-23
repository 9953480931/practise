package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class IteratorExample {
	
	int  B;
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public int a(){
	   	 b();
	   return 1;
	}
public int b(){
	      c();
		return 2;
	}
public int c(){
	return 3;
}
	
	public int divide(int a, int b){
		int val = 0;
		try{
		return val = a/b;
		}
		catch(Exception e){
			 System.out.println("catch block   "+e.getMessage());
			//return 9;
			
		}
		finally{
			System.out.println("final block");
			//return 10;
		}
		//return val;
		return val;
	}
	
public static void main(String[] args) {
	Map<String,String> list = new HashMap<String,String>();
//	Map<String,String> list  =Collections.synchronizedMap(l);
	list.put(null,null);
	list.put("B","b");
	list.put("C","c");
	Iterator<Entry<String,String>> itr = list.entrySet().iterator();
	//list.put("C","c");
	//list.remove("C");
	//list.put("D","d");
	//String fd =list.put("D","d");
	//System.out.println(fd==null);
	
	boolean flag;
	/*
	while(flag=itr.hasNext()){
		flag?itr.next():"false";
	}*/
	
	//list.put("D","c");
	
	System.out.println(list);
	
	IteratorExample ii = new IteratorExample();
	//System.out.println(ii.divide(5, 0));
	System.out.println(ii.a());
	
   Set<String> s = new HashSet<String>();
   
   s.add("A");
   s.add("B");
   s.add(null);
   
   Set<String> sd = Collections.emptySet();
  // System.out.println();
   
   System.out.println("dsd"+ sd);
   
   List<String> lll = new ArrayList<>();
   lll.add("A");
   lll.add("A");
   lll.add("A");
   String name="";
   Object obj;
  lll.contains("A");
	  
   System.out.println(lll);
   System.out.println(s);
   
	
}
}
