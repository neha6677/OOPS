package corejava;

import java.util.Scanner;


class Area1 {

	double L;
	double W;
	double H;
	public Area1(double L, double W, double H) {
		super();
		
	}
	

	public Area1() {
		super();
		// TODO Auto-generated constructor stub
	}


	void areaOfTraingle(double L,double W,double H) {
		double Traingle =L*W*H;
		
		System.out.println("print area of tringle-"+Traingle);
	}
	
	
	void areaOfRectangle(double L, double H,double W) {
		
		double Rectangle =L*W;
		
		System.out.println("area of Rectangle-"+Rectangle);
	}
	
	
	void areaOfSquare(double L, double H,double W) {
		
		double Square= L*L;
		System.out.println(" area of Square-"+Square);
		
	}
	
	
		
		
	
	
	
	
	}
	
	



public class Area_checkinfo {

	public static void main(String[] args) {
		
				
				Area1 area=new Area1();
				
				Scanner s= new Scanner(System.in);
				System.out.println("enter the three side");
				
				double L =s.nextDouble();
				double W =s.nextDouble();
				double H =s.nextDouble();
				
				
				
				if(L==W || L==H || W==H) {
					
					area.areaOfSquare(L,W,H);
					
				}
				else  {
					
					area.areaOfRectangle(L,W,H);
				
				
					area.areaOfTraingle(L, W, H);
					
					if(H== L+W || L==H+W || H==L+W){
			            System.out.println("Right-Angle Triangle");
					}
			            else {
			            	System.out.println("NotRight-Angle Triangle");
			            }
					
				}
				            }
}
			
		