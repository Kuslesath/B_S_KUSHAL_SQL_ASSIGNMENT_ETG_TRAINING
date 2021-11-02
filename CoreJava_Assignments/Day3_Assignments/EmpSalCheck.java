package Day3_Assignments;

public class EmpSalCheck extends Exception {

	public static void main(String[] args) throws MyOwnExcpn{
		int asal=10000;
		if(asal<100000) {
			throw new MyOwnExcpn("Employee Annual Salary is less than 100000");
		}
		else System.out.println("Employee Annual Salary is more than 100001");
	}
}
