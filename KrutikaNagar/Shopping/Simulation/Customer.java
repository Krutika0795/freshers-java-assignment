package com;

public class Customer {

	private String name;
	private int age;
	private String typeofshopper;
	private String Interest;
	private int timingPreference;
	
	
	public Customer(String name, int age, String typeofshopper,
			String interest, int timingPreference) {
	
		this.name = name;
		this.age = age;
		this.typeofshopper = typeofshopper;
		Interest = interest;
		this.timingPreference = timingPreference;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTypeofshopper() {
		return typeofshopper;
	}
	public void setTypeofshopper(String typeofshopper) {
		this.typeofshopper = typeofshopper;
	}
	public String getInterest() {
		return Interest;
	}
	public void setInterest(String interest) {
		Interest = interest;
	}
	public int getTimingPreference() {
		return timingPreference;
	}
	public void setTimingPreference(int timingPreference) {
		this.timingPreference = timingPreference;
	}

	public void display(){
		System.out.println("Customer Age is " +getAge());
		System.out.println("Customer Name is " +getName());
		System.out.println("Customer Time Preference is " +getTimingPreference());
		System.out.println("Customer Type of Shopper " +getTypeofshopper());
		System.out.println("Customer Intersts " +getInterest());
	
	}

	}

