package Day3_Assignments;

public class Dev extends Emp{

	Dev(int a,String b){
		//constructor with 3 parameters 
		this.eid=a;
		this.ename=b;
	}
	public double salCal(int a) {
		this.esal=a*1.2;
		return this.esal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev e1= new Dev(1001,"kushal");
		e1.salCal(10000);
		e1.display();
	}

}
