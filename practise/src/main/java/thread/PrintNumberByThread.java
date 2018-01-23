package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Odd implements Runnable {

	@Override
	public void run() {

	}

}

class Even implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class EvenOdd implements Runnable {
	Lock lock = new ReentrantLock();
	
	 int i;

	@Override
	public void run() {
  for(i=0;i<20;i++) {
	 // System.out.println(Thread.currentThread().getName()+" has value "+i );
				if (i % 2 == 0  && Thread.currentThread().getName().equals("EvenThread") ) {
					//synchronized (lock) {
				//	lock.lock();
					System.out.println("Even number is " + i);
				//	lock.unlock();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//	try {
					
				//	} catch (InterruptedException e) {
						// TODO Auto-generated catch block
					//	e.printStackTrace();
				//	}
					//lock.notify();
				//}
			}
				
			if (i % 2 != 0  && Thread.currentThread().getName().equals("OddThread")) {
				//	synchronized (lock) {
				   //lock.lock();
					System.out.println("Odd number is " + i);
					//lock.unlock();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//	}
				
			}
			
		}

	}

}

public class PrintNumberByThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new EvenOdd(), "OddThread");
		Thread t2 = new Thread(new EvenOdd(), "EvenThread");
		//Thread t3 = new Thread(new EvenOdd(), "EvenOddThread");

		t2.start();
		t1.start();

		// t3.start();
	}
}
