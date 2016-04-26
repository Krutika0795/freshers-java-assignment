package com;

import java.util.Date;
public class Cart implements Runnable {

	@Override
	public void run() {
	System.out.println("Cart Taken");
	Date d=new Date();
	System.out.println(d);
	}

	

}
