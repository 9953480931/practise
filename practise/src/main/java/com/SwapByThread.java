package com;

import java.util.ArrayList;
import java.util.List;

public class SwapByThread {
   
   public void  addinList(List<String> list){
	   list.add("local");
   }
   public void swap(int a , int b) {
	System.out.println("Before swapping value of a is "+a+" value of b is "+b);   
	a = a+b;   
	b = a-b;
	a = a-b;
	System.out.println("After swapping value of a is "+a+" value of b is "+b);
   }
   
   public static void main(String[] args) {
	   
	   List<String> list = new ArrayList<>();
	   list.add("Main");
	   SwapByThread s = new SwapByThread();
  // 	s.swap(5, 3);
	   s.addinList(list);
	   System.out.println(list);
}
}
