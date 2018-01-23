package com;

class Demoo implements Runnable {

	TestThread tt = new TestThread();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			tt.printEven();
			tt.printOdd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class TestThread {
  Object key = new Object();
  
  void printEven() throws InterruptedException{
	  synchronized (key) {
	    System.out.println("Even by  "+Thread.currentThread());
	  
	  }
  }
  
  void printOdd(){
	  System.out.println("odd "+Thread.currentThread());
  }
  
  public static void main(String[] args) {
	Demoo d = new Demoo();
	Thread t1 = new Thread(d);
	Thread t2 = new Thread(d);
	t1.start();
	t2.start();
}
  
}
