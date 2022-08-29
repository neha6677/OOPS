package com.electronics;


public class Demo {

	public static void main(String[] args) {
		 Electronics e1=new Electronics(1, "Cropton", "10-12-2022");
	        Electronics e2=new Mobile(2, "Samsung", "12-09-2021");
	        Electronics e3=new LCD(3, "Sony", "06-12-2018");
	        Electronics e4=new Laptop(4, "Asus", "26-05-2020");
	        
	        System.out.println("Electronic="+e1);
	        System.out.println("Mobile="+e2);
	        System.out.println("LCD="+e3);
	        System.out.println("Laptop="+e4);
	    }

}