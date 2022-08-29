package corejava;



interface Shape {
	double area();

	
	
}

class Rectangle implements Shape {
	

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {

		return length * breadth;
	}
}
class Square implements Shape{
	
	private double s;
	
	public Square(double s) {
		this.s = s;
		
	}
	
	@Override
	public double area() {
		
		return s*s*s*s;
	}
	
}
class Point {
	  int x;
	  int y;

	  public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }

	}
class Triangle extends Point implements Shape {
	public Triangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



	Point A; Point B; Point C;
	


	//public Triangle() {
		//super();
		// TODO Auto-generated constructor stub
	//}

	@Override
	public double area() {
		 
		/**
		   * Java method to return area of triangle using vertices as per following
		   * formula area = (Ax(By -Cy) + Bx(Cy -Ay) + Cx(Ay - By))/2
		   * 
		   * @return
		   */
		  
		    double area = (A.x * (B.y - C.y) 
		                    + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
		    return Math.abs(area);
		  }
		
		//return (base*height)/2;

	
}
public class Share_areas {

	public static void main(String[] args) {
		
		Point A = new Point(8, 6);
		Rectangle r = new Rectangle(2, 12);
		System.out.println("Rectangle - Area: " + r.area());
		
		Square s = new Square(12);
		System.out.println("Square Area : "+s.area());
		
		Triangle t = new Triangle(0, 0);
		System.out.println("Triangle Area is "+t.area());

	}

}

