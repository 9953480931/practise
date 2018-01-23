package com;

import java.util.concurrent.atomic.AtomicInteger;

class Var implements Runnable {
	AtomicInteger count = new  AtomicInteger();
	
	@Override
	public void run() {
		for(int i =1 ; i<11;i++) {
		   count.incrementAndGet();
		   System.out.println("5  x  "+i +"  =  "+(5*i));
		}
	}

	public int getCount() {
		return this.count.get();
	}

}

public class AtomicVar  {

	public static void main(String[] args) throws InterruptedException {
		
		Var v = new Var();
		Thread t1 = new Thread(v);
		//Thread t2 = new Thread(v);
		
		t1.start();
		//t2.start();
        t1.join();
        //t2.join();
		System.out.println(v.getCount());
	}
	
}
