package corejava;

class Product1 implements Cloneable{
	private String pid;
	private String pname;
	private String unit;
	private int rs;
	
protected Product1 clone() throws CloneNotSupportedException {
		
		return (Product1) super.clone();
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	public Product1(String pid, String pname, String unit, int rs) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.unit = unit;
		this.rs = rs;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", unit=" + unit + ", rs=" + rs + "]";
	}
	
	
	
}
public class Clone_method {

	 public static void main(String[] args) throws CloneNotSupportedException {
		 
		 
	 
	        
	        Product1 pro1=new Product1("1", "parle", "22", 1000);
	        
	        Product1 pro2=(Product1) pro1.clone();
	        
	        pro2.setPname("Godrege");
	        pro2.setPid("111");
	        
	        System.out.println(pro2);
	        if(pro2 instanceof Product1) {
	            
	            System.out.println("Objects are same");
	
}
	 }
}
