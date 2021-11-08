package Day4_Assignments;

public class EmployeeImpl extends Employee implements EmployeeInt {

	@Override
	public void addEmployee(Employee e1) {
		
	}
	@Override
	public double yearSalary(Employee e1) {
		return e1.getEmpsal()*12;
	}
	@Override
	public double appSalary(Employee e1) {
		double i=0;
		if (e1.getEmpsal()<10000){
			e1.setEmpsal(e1.getEmpsal()+5000);
			i= e1.getEmpsal();
			return i;
		}
		else
			return e1.getEmpsal();
	}
	@Override
	public void deleteEmployee(Employee o) {
		
	}

	
}
