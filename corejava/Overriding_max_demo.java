package corejava;

class Parent{
	int a,b,c,d;
	Parent(){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	void display(int a, int b, int c) {
		System.out.println("Max of 3 number in parent class");
	}
	
	
	public static int max(int a, int b, int c, int d){
		System.out.println("Max of 4 number in parent class");
        return (a>b && a>c && a>d? a: b>c && b>d? b: c>d? c:d);
    }
	
}

class Child extends Parent{
	Child(){
		super();
	}
	
	//override
	void display(int a, int b, int c) {
		int temp,largest=0;
		temp=a>b?a:b;  
		largest=c>temp?c:temp; 
		System.out.println("Max of 3 number in parent class");
	}
	
	
	public static int max(int a, int b, int c, int d){
		System.out.println("Max of 4 number in child class");
		
		 if (a > b && a > c && a > d)
		        return a;
		    if (b > c && b > d)
		        return b;
		    if (c > d)
		        return c;
		    return d;
    }
}
public class Overriding_max_demo {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.max(1, 3, 4, 5);
		
		/*int a=112, b=3, c=23, largest, temp;
		
		temp=a>b?a:b;  
		largest=c>temp?c:temp; 
		Child c1 = new Child();
		c1.max(1, 3, 4, 5);*/
		
		//System.out.println("The largest number is: "+largest);  

	}

}
