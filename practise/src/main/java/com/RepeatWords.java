package com;

import java.text.MessageFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class HashValueComaparator implements Comparator<Entry<Character, Integer>> {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		// TODO Auto-generated method stub
		return (o1.getValue() - o2.getValue());
	}

}

class HashKeyComparator implements Comparator<Entry<Character, Integer>> {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getKey().compareTo(o2.getKey());
	}
	
}

public class RepeatWords {

	public void findDuplicate(String str) {

		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : ch) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		System.out.println("Before Sorting");

		System.out.println(map);

		System.out.println("After Sorting");

		List<Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());

		java.util.Collections.sort(list, new HashValueComaparator());

		System.out.println(list);
		
		/*System.out.println("Sorted Key"); 
		
		java.util.Collections.sort(list, new HashKeyComparator());
		
		System.out.println(list);*/
		
		System.out.println("=============");
		
		System.out.println(toMyString(list));
		
	}

	public StringBuilder toMyString(List<Entry<Character, Integer>> list) {
		StringBuilder ss = new StringBuilder();
	     for(Entry<Character, Integer> e : list) {
	    	 ss.append(MessageFormat.format("Key is {0}  and word count is {1}", e.getKey(),e.getValue())+"\n");
	     }
		return ss;
	     
	}

	public static void main(String[] args) {
		String st ="Jaspreetpdsfdf ";
		String str = st.replaceAll("\\s", ""); 
		
		new RepeatWords().findDuplicate(str);

	}
}
