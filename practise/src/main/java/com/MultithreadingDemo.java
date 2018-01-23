package com;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Multithreading extends Thread
{ 
    public void run()
    {
        try
        {
        	synchronized (this) {
			 // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running 2");
        	}
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
}
public class MultithreadingDemo {
	 public static void main(String[] args)
	    {
	        //int n = 8; // Number of threads
	        for (int i=0; i<8; i++)
	        {
	        	Multithreading object = new Multithreading();
	            object.start();
	        }
	    }
}
