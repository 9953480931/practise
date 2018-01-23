package com;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CountWordsFromFile {
public static void main(String[] args) {
	
	Map<String,Map<Character,Integer>> fileMap = new HashMap<>();
	
	Map<Character,Integer> countWord = new HashMap<>();
	countWord.put('A', 1);
	countWord.put('B', 2);
	countWord.put('C', 2);
	countWord.put('D', 1);
	fileMap.put("file1",countWord);
	
	System.out.println(fileMap);
	
	
	File file = new File("E:\\shared folder");
    File[] files = file.listFiles();
    for(File f: files){
        System.out.println(f.getName());
    }
 }
}

