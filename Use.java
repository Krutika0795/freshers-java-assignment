package com;

	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


	public class Use extends Thread{
		static Customer c;
static Cart k;
		
	public static void Basic()throws IOException{
		
		
		System.out.println("Enter the number of carts");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,c=0;
		
		n=Integer.parseInt(br.readLine());
		int r, x=n;
	for(c=1; c!=n;c++){
		System.out.println("Customer entered");
		Date d=new Date();
		System.out.println(d);
		}
	if (c>n){
			System.out.println("Wait, Carts Unavailable ");
			}
	
	 r=x-n;
	System.out.println("Carts Avaialbe are"+r);
	for(int i=1;i<=n;i++){
		System.out.println("inside the loop");
		Thread ti=new Thread();
		k.run();
		ti.start();
		}
		
	}
	}
