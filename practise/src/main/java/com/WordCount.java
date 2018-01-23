package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
public static void main(String[] args) {
	Map<String ,Integer> mapwords = new HashMap<>();
	
	String str ="this is jaspreet jaspreet is";
	
	String [] words = str.split("\\s");
	
	
	
	int index =0;
	
	String[] uniqueWords = new String[words.length];
	
	for(String word : words) {
	  if(mapwords.containsKey(word)){
		  mapwords.put(word, mapwords.get(word)+1);
	  }
	  else{
	      mapwords.put(word, 1); 
	  }
	}
	
	Set<String> word = mapwords.keySet();
	
	System.out.println(word);
	for(String strs : word)
		System.out.println(strs);
	
	/*System.out.println(mapwords); 
	System.out.println(uniqueWords.length);
	
	for(String word :uniqueWords)
	     System.out.println(word);*/
 }
}
