package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Use extends Thread {
	static Customer c1;
	static Customer c2;
	static Customer c3;
	static Customer c4;
	static Customer c5;
	
	static Cart k=new Cart();
	

	public void Basic() throws IOException {

		System.out.println("Enter the number of carts");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		n = Integer.parseInt(br.readLine());
		int r;
		System.out.println("Enter number of customer");
		
		Scanner sc = new Scanner(System.in);
		int cust= sc.nextInt();
		if (cust > n) {
			System.out.println("Wait, Carts Unavailable ");
		}

		r = n-cust;
		System.out.println("Carts Avaialbe are" + r);
		int x=n-r;
		System.out.println("Number Shoppers in shop are " +x);
		System.out.println("Enter Your Prefernce of Shopping");
		System.out.println("1. Kids wears");
		System.out.println("2.Formals");
		System.out.println("3.Causals");
		System.out.println("4. Ethnic Wear");
		System.out.println("5. Party Wear");
		System.out.println("6. All Variety");
			int a = Integer.parseInt(br.readLine());
			switch (a) {
			case 1:
				System.out.println("Kids Wear");
				break;
			case 2:
				System.out.println("Formals");
				break;
			case 3:
				System.out.println("Causals");
				break;
			case 4:
				System.out.println("Ethic Wear");
				break;
			case 5:
				System.out.println("Party Wear");
				break;
			case 6: 
				System.out.println("All Variety");
			}
		
			System.out.println("Customer entered");
			Thread t1 = new Thread(k);
			
			k.Shopper("Customer ");
			k.run();
			k.start();
			
			
c1=new Customer("XYZ", 39, "Heavy", "All", 1);
			c2=new Customer("abc", 40, "low", "Causals", 7);
			c3=new Customer("Sam", 24, "medium", "Formals", 9);
			c4=new Customer("Lily", 19, "medium", "ethnic & Causals", 5 );
			c5=new Customer("mnop", 60, "low", "kids-wear", 11);
			c1.display();
			c2.display();
			c3.display();
			c4.display();
			c5.display();
		
		

	}
}
