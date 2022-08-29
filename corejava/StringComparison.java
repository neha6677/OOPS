package corejava;

import java.util.Scanner;

class Parent1{
	
	void stringComparisionu(){
		System.out.println("Parent Method");
		
	}
}

class child1 extends Parent1{
	
	public void stringComparisionu(){
		System.out.println("child Method");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.next();
		
		System.out.println("Enter second string");
		String s2=sc.next();
		int strlen = s2.length();
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<strlen;i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					System.out.println(i+1+" character matched");
				}
				else {
					System.out.println(i+"character not matched");
				}
				
			}
		}
		else {
			System.out.println("Not comparable");
		}
		
		
	}
	
}

public class StringComparison {

	public static void main(String[] args) {
		
		//Child1 c = new Child1();
		Parent1 p = new Parent1();
		p.stringComparisionu();
		p=new child1();
		p.stringComparisionu();
		
		
	}

}
