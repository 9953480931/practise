package com;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.swing.internal.plaf.synth.resources.synth;

interface i{
	public void t();
   public void t2();
}

class i2 implements i{

	@Override
	public void t() {
		System.out.println("T PRINTED");
		
	}

	@Override
	public void t2() {
		System.out.println("T2 PRINTED");
		
	}
	
	public void t3() {
		System.out.println("T2 PRINTED");
		
	}
	
}


class View {
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	 static int a;
	
	
	public void a() {
		  lock1.lock();
		   System.out.println("Currently in thread "+Thread.currentThread()+"executing function A");
		   b();
		  lock1.unlock();
	}
	
	public void b() {
		    lock2.lock();
			System.out.println("Currently in thread "+Thread.currentThread()+"executing function B");
			c();
			System.out.println();
			lock2.unlock();
		
	}
	
	public void c() {
		 lock1.lock();
			System.out.println("Currently in thread "+Thread.currentThread()+"executing function C");
			lock1.unlock();
	}
}

class ViewRunnable implements Runnable {

	private static View view = new View();
	
	@Override
	public void run() {
			view.a();
			view.b();
	}

}

class CountNumber implements Runnable{
	
	int a;
	
	public synchronized int increment() {
		int  b=0;
		 b++;
		System.out.println("value of b  "+ b+"  by thread "+Thread.currentThread());
	  return a++;
	}

	@Override
	public void run() {
		System.out.println(increment());
		
	}
}
public class ThreadClient {

    public static void main(String[] args) {
    	/*ViewRunnable task = new ViewRunnable();
			
    	Thread t1 = new Thread(task);
    	Thread t2 = new Thread(task);
    	t1.start();
    	t2.start();*/
    	
    /*	char [] arr = new char[10];
    	
    	arr[0]='V';
    	arr[1]='c';
    	arr[2] =1.0f;
    	System.out.println(arr);*/
    	
    	CountNumber cn =new CountNumber();
    	
    	Thread [] threads = new Thread[10];
    	
    	for(int i =1 ; i<=10; i++) {
    		threads[i-1] = new Thread(cn);
    		threads[i-1].start();
    	}
    	
    	i it = new i2();
	}
	
}
