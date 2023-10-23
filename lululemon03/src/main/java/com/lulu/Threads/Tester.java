package com.lulu.Threads;

public class Tester {

	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

 

		ThreadLifeMethods t1=new ThreadLifeMethods();
		ThreadLifeMethods t2=new ThreadLifeMethods();
		t1.setPriority(Thread.MAX_PRIORITY);//10

		t1.setName("Lulu1");
		t2.setName("Lulu2");
		System.out.println("is is alive t1 :"+t1.isAlive());

		t1.start();
		System.out.println("is is alive t1 :"+t1.isAlive());
//		t1.run();
		t1.join();
		t2.start();
		t1.getPriority(); ///Norm -5
		System.out.println(t1.getPriority());
		//t1.stop();
        t1.isAlive();
        t2.isAlive();

	}

 

}