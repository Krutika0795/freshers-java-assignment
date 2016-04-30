package com;

import java.util.Scanner;



public class Cart implements Runnable {
	
	private Thread t;
	private String threadname;

	public void Shopper(String name) {
		threadname = name;
	}

	@Override
	public void run(){

			for (int i = 1; i<=5; i++) {
				System.out.println("Thread:" + threadname + "  " + i);
				
				System.out.println("thread" + threadname + "existing");
	}}

	public void start() {
		System.out.println("Starting" + threadname);
		if (t == null) {
			t = new Thread(this, threadname);
			t.start();
			System.out.println("Cart Taken");		
		}
	}

}
