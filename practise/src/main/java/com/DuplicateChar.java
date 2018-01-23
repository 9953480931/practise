package com;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class CountChar {
	Integer count;
	Character c;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Character getC() {
		return c;
	}
	public void setC(Character c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "CountChar [count=" + count + ", c=" + c + "]";
	}
	
	
}

/*class SortWord<T> implements Comparator<T> {

	@Override
	public int compare(T t1, T t2) {
		
		return (int)t1.getCount() -t2.getCount();
	}
	
}*/

public class DuplicateChar {
	public void findDuplicate(String str) {
		Map<Character, Integer> map = new TreeMap<Character,Integer>();
		
		char [] charString = str.toCharArray();
		
		for(Character c : charString) {
			if(map.containsKey(c)) 
				map.put(c, map.get(c)+1);
			else
			   map.put(c, 1);
			
		}	

	Set<Character> setKey	= map.keySet();
	
	List<CountChar> ll = new ArrayList<CountChar>();
	
	CountChar countchar = new CountChar();
	
	for(Character cc: setKey) {
		if(map.get(cc)>=1)
		 System.out.println(cc+" has count of "+map.get(cc));
		/*countchar.setC(cc);
		countchar.setCount(map.get(cc));
		ll.add(countchar);*/
		}
	//System.out.println(ll.toString());
	}
	
public static void main(String[] args) {
	DuplicateChar duplicateChar = new DuplicateChar();
//	duplicateChar.findDuplicate("This is jaspreet Singh");
	HashMap<String,Integer> m = new HashMap<String,Integer>();
	m.put("A",1);
	m.put("B",2);
	m.put("C",3);
	m.put("D",4);
	m.put("efdc",4);
	
	
     Set entries=  m.entrySet();
     Entry entry =(Entry) entries.iterator();
   
     
	System.out.println(m);
}
}
