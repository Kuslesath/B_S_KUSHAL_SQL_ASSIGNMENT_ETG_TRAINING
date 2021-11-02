package Day3_Assignments;

public class Tester extends Emp {

	Tester(int a,String b){
		//constructor with 3 parameters 
		this.eid=a;
		this.ename=b;
	}
	public double salCal(int a) {
		this.esal=a*1.1;
		return this.esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester e1= new Tester(1001,"kushal");
		e1.salCal(10000);
		e1.display();
	}

}
