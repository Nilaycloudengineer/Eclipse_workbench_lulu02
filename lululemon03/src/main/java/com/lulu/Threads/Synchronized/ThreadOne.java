package com.lulu.Threads.Synchronized;

public class ThreadOne extends Thread{
	
	public void run() {

		ResourceTwo.processtwo();
	}

}

