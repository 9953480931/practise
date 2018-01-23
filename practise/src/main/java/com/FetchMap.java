package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FetchMap {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("A", "a");
		map.put("B", "b");
		
	Set<Entry<String,String>> entry =map.entrySet();
	
	List<Entry<String,String>> ll = new LinkedList<>(entry);
	
	List<Entry<String,String>> al = new ArrayList<>(entry);
	
	
	 for(Entry<String,String> e : al){
		 System.out.println("key "+e.getKey()+"  value is "+e.getValue());
	 }
	}

}
