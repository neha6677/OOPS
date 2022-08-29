package corejava;

abstract class CalcAbs{
	
	abstract void sum(int a, int b);
	abstract void sub(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a,int b);
}
 abstract class A extends CalcAbs{
	 void sum(int a, int b) {
		 System.out.println("Sum is "+a+b);
	 }
 }
 abstract class B extends A{
	 void sub(int a, int b) {
		 System.out.println("Substraction is "+(a-b));
 }
 }
 
 abstract class C extends B{
	 void mul(int a, int b) {
		 System.out.println("Multiplication is "+a*b);
	 }
 }
 
 class D extends C{

	@Override
	void div(int a, int b) {
		System.out.println("Division is "+(a/b));
		
	}
	 
 }
 
public class MultiLevelInheri_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.sum(12, 23);
		d.div(20, 10);
		d.mul(4, 4);
		d.sub(60, 10);

	}

}
