package corejava;
import java.util.Date;

public class Employee_date_exp {
	
	
		int empid;
		String empname,empaddress;
		double empsalary; 
		Date emp_dob, emp_doj;
		public Employee_date_exp(int empid, String empname, String empaddress, double empsalary, Date emp_dob,
				Date emp_doj) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.empaddress = empaddress;
			this.empsalary = empsalary;
			this.emp_dob = emp_dob;
			this.emp_doj = emp_doj;
		}
		public Employee_date_exp() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employee_date_exp [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress
					+ ", empsalary=" + empsalary + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
		}
		
		
	}

class Test
{
	public static void main(String[] args) 
	{
		Date dob = new Date(1991,11, 15);
		Date doj = new Date(2022, 07, 07);
		Employee_date_exp e = new Employee_date_exp(176,"Sayali","Pune", 78654, dob, doj);
         System.out.println(e);
         
         
	}


}