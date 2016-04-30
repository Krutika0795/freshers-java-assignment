package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
	
static Use u=new Use();
	

	public static void main(String[] args) throws IOException {
		ProductInfo p1 = new ProductInfo();
		ProductInfo p2 = new ProductInfo();
		ProductInfo p3 = new ProductInfo();
		ProductInfo p4 = new ProductInfo();
		ProductInfo p5 = new ProductInfo();
		ProductInfo p6 = new ProductInfo();
		ProductInfo p7 = new ProductInfo();
		ProductInfo p8 = new ProductInfo();
		ProductInfo p9 = new ProductInfo();
		ProductInfo p10 = new ProductInfo();
		ProductInfo p11 = new ProductInfo();
		ProductInfo p12 = new ProductInfo();
		ProductInfo p13 = new ProductInfo();
		ProductInfo p14 = new ProductInfo();
		ProductInfo p15 = new ProductInfo();
		p1.setItemcode("K001");
		p1.setItemcost(400);
		p1.setItemtype("Kidswear");
		p1.setStock(10);
		p2.setItemcode("K002");
		p2.setItemcost(750);
		p2.setItemtype("Kidswear");
		p2.setStock(15);
		p3.setItemcode("F001");
		p3.setItemcost(700);
		p3.setItemtype("Formals");
		p3.setStock(20);
		p4.setItemcode("F002");
		p4.setItemcost(1100);
		p4.setItemtype("Formals");
		p4.setStock(5);
		p5.setItemcode("F003");
		p5.setItemcost(600);
		p5.setItemtype("Formals");
		p5.setStock(25);
		p6.setItemcode("F004");
		p6.setItemcost(2200);
		p6.setItemtype("Formal");
		p6.setStock(35);
		p7.setItemcode("E001");
		p7.setItemcost(1500);
		p7.setItemtype("Ethnic Wear");
		p7.setStock(15);
		p8.setItemcode("E002");
		p8.setItemcost(2000);
		p8.setItemtype("Ethnic Wear");
		p8.setStock(10);
		p9.setItemcode("C001");
		p9.setItemcost(450);
		p9.setItemtype("Causal");
		p9.setStock(50);
		p10.setItemcode("C002");
		p10.setItemcost(800);
		p10.setItemtype("Causal");
		p10.setStock(5);
		p11.setItemcode("C003");
		p11.setItemcost(200);
		p11.setItemtype("Causal");
		p11.setStock(75);
		p12.setItemcode("C004");
		p12.setItemcost(600);
		p12.setItemtype("Causal");
		p12.setStock(10);
		p13.setItemcode("C005");
		p13.setItemcost(1400);
		p13.setItemtype("Causal");
		p13.setStock(3);
		p14.setItemcode("P001");
		p14.setItemcost(2000);
		p14.setItemtype("Party Wear");
		p14.setStock(10);
		p15.setItemcode("P002");
		p15.setItemcost(3000);
		p15.setItemtype("Party Wear");
		p15.setStock(15);
		ArrayList<ProductInfo> item = new ArrayList<ProductInfo>();
		item.add(p1);
		item.add(p2);
		item.add(p3);
		item.add(p4);
		item.add(p5);
		item.add(p6);
		item.add(p7);
		item.add(p8);
		item.add(p9);
		item.add(p10);
		item.add(p11);
		item.add(p12);
		item.add(p13);
		item.add(p14);
		item.add(p15);
		
		ArrayList<ProductInfo> kart2 = new ArrayList<ProductInfo>();
		kart2.add(p9);
		kart2.add(p10);
		kart2.add(p11);
		kart2.add(p12);
		kart2.add(p13);
		ArrayList<ProductInfo> kart3 = new ArrayList<ProductInfo>();
		kart3.add(p4);
		kart3.add(p5);
		kart3.add(p6);
		ArrayList<ProductInfo> kart4 = new ArrayList<ProductInfo>();
		kart4.add(p14);
		kart4.add(p7);
		ArrayList<ProductInfo> kart5 = new ArrayList<ProductInfo>();
		kart5.add(p1);
		kart5.add(p2);

		
	u.Basic();
	int total=0;
	int total1=0;
	int total2=0;
	int total3=0;
	int total4=0;
	for (ProductInfo pi : item) {
		System.out.println("Item code is " +pi.getItemcode());
		System.out.println("Item cost is "+pi.getItemcost());
		System.out.println("Item type is "+pi.getItemtype());
		System.out.println("Item Stock is "+pi.getStock());
	total=total+pi.getItemcost();
	System.out.println("the total bill is" +total);
	}
				for(ProductInfo pi :kart2){
					System.out.println("Item code is " +pi.getItemcode());
					System.out.println("Item cost is "+pi.getItemcost());
					System.out.println("Item type is "+pi.getItemtype());
					System.out.println("Item Stock is "+pi.getStock());
				total1=total1+pi.getItemcost();
				System.out.println("the total bill is" +total1);
				}
				
				for(ProductInfo pi :kart3){
					System.out.println("Item code is " +pi.getItemcode());
					System.out.println("Item cost is "+pi.getItemcost());
					System.out.println("Item type is "+pi.getItemtype());
					System.out.println("Item Stock is "+pi.getStock());
				total2=total2+pi.getItemcost();
				System.out.println("the total bill is" +total2);
				}
				for(ProductInfo pi :kart4){
					System.out.println("Item code is " +pi.getItemcode());
					System.out.println("Item cost is "+pi.getItemcost());
					System.out.println("Item type is "+pi.getItemtype());
					System.out.println("Item Stock is "+pi.getStock());
				total3=total3+pi.getItemcost();
				System.out.println("the total bill is" +total3);
				}
				for(ProductInfo pi :kart5){
					System.out.println("Item code is " +pi.getItemcode());
					System.out.println("Item cost is "+pi.getItemcost());
					System.out.println("Item type is "+pi.getItemtype());
					System.out.println("Item Stock is "+pi.getStock());
				total4=total4+pi.getItemcost();
				System.out.println("the total bill is" +total4);
				}
			int sale=total+total1+total2+total3+total4;
			System.out.println("Sale to the shop is "+sale);
					}
		
	}

