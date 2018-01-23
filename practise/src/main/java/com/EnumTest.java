package com;

enum EnumTest implements Runnable {
	instance(),instance2;
	
	public EnumTest getInstance() {
		return instance; 
	}
	
	@Override
	public void run() {
		System.out.println(getInstance().hashCode());
	}
  public static void main(String[] args) {
	  
	  Thread[] t = new Thread[10];
	  for(int i =0 ; i<9;i++){
		  t[i]= new Thread(EnumTest.instance);
		  t[i].start();
	  }
  }

}
