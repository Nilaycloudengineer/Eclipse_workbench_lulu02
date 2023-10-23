package com.lulu.thread;

public class MyFirstThread extends Thread {

	public void run() { // we trying to override -
		for (int i = 1; i <= 50; i++) {
			System.out.println("I m thread " + i);
			System.out.println("current thread "+ Thread.currentThread());

		}
	}

}

