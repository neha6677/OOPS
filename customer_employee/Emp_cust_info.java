package customer_employee;

public class Emp_cust_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1[]=new Department[2];
		//d1[0].setDeptid(10);
		//d1[1].setDname("Reshma");
		for(int i=0;i<d1.length;i++) {
		Employee e2 = new Employee(101, "neha", "indore", "01/04/2001", 15000.0, "02/06/2018", "pune", d1[i], 989313, "neha@yash.com");
		
		
		System.out.println(e2);
		}
		Customer c1=new Customer(121, "Megha", "Pandharpur", "06/12/1995", "15/08/2022", "Pune", 1234567890, "megha@yash.com");
		//Person p1=new Person(002, "Veda", "Amravati", "12/12/1995");
		Employee e1 = new Employee();
		e1.setPid(1001);
		System.out.println(e1.getPid());
		
		e1.setPname("Neelu");
		System.out.println(e1.getPname());
		
		e1.setPaddress("Bhopal");
		System.out.println(e1.getPaddress());
		
		e1.setDob("1/1/2000");
		System.out.println(e1.getDob());
		
		
		
	}

}
