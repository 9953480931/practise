package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

interface a {

	void test();
	
	void test2();
}

abstract class c implements a{
	public void test(){
		
	}
	
  public abstract void test2();
 
}

class b extends c  implements a{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}


class MessageExample {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public MessageExample(String msg) {
	 this.msg=msg;
	}

	@Override
	public String toString() {
		return msg;
	}
	
	
}

class Producer implements Runnable {
	BlockingQueue<MessageExample> bq ;
	
	
	
	public Producer(BlockingQueue<MessageExample> bq) {
		super();
		this.bq = bq;
	}



	@Override
	public void run() { 
		for(int i=0; i<100;i++){
			MessageExample me = new MessageExample("Object"+i);
			try {
				Thread.sleep(10);
				bq.put(me);
				System.out.println("Produced by "+Thread.currentThread()+"-->"+me.getMsg());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			System.out.println("Exit printed by "+Thread.currentThread());
			bq.put(new MessageExample("Exit"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Consumer  implements Runnable{
	
	BlockingQueue<MessageExample> bq ;

	public Consumer(BlockingQueue<MessageExample> bq) {
		super();
		this.bq = bq;
	}

	@Override
	public void run() {
		MessageExample msg;
	try {
		//if(Thread.currentThread().getName().equals("Consumer 2")) {
		while((msg = bq.take()).getMsg() != "Exit"){
			//Thread.sleep(1000);
			System.out.println("Cosumed by "+Thread.currentThread()+"--> "+msg);
		}
		System.out.println("Exit removed by "+Thread.currentThread());
	//	}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("queue size "+bq.size());
	}
	
}

public class BlockingQueueExample {
	
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<MessageExample> bq = new LinkedBlockingQueue<>();
		
		Thread t1 = new Thread(new Producer(bq),"Producer 1");
		Thread t2 = new Thread(new Consumer(bq),"Consumer 1");
		Thread t3 = new Thread(new Consumer(bq),"Consumer 2");
		Thread t4 = new Thread(new Producer(bq),"Producer 2");
		
		
		t1.start();
		t4.start();
		
		
		t3.start();
		t2.start();
	}
}
