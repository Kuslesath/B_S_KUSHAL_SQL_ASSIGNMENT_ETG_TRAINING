package Day4_Assignments;

import java.util.*;

public class UserEmployee extends EmployeeImpl {
	
	public static List<Employee> m = new LinkedList<Employee>();

	
	public static void main(String args[]) {
				
		EmployeeImpl e1= new EmployeeImpl();

		e1.setEmpid(333);
		e1.setEmpname("dhanush");
		e1.setEmpsal(100);
		double x=e1.yearSalary(e1);
		double y=e1.appSalary(e1);
		m.add(e1);
		System.out.println(m.get(0));
		System.out.println("Annual Salary of above employee is "+x);
		System.out.println("updated Salary per month of above employee is "+y);
		
		EmployeeImpl e2= new EmployeeImpl();

		e2.setEmpid(333);
		e2.setEmpname("mark");
		e2.setEmpsal(11000);
		double x1=e2.yearSalary(e2);
		double y2=e2.appSalary(e2);
		m.add(e2);
		System.out.println();
		System.out.println();
		System.out.println(m.get(1));
		System.out.println("Annual Salary of above employee is "+x1);
		System.out.println("updated Salary per month of above employee is "+y2);

		
	}

}
