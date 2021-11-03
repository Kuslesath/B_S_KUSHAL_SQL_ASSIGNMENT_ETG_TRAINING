package Day3_Assignments;


public class TechEmp extends Employee {
	
	
	String skills;
	
	@Override
	 double salcal() {
		
		double hra=0.12*Bpay;
		return Bpay+hra;
		
	}
	
	@Override
	public String toString() {
		return "TechEmp [eid=" + eid + ", ename=" + ename +"]";
	}
	
	public static void main (String args[]) {
		Address a=new Address();
		a.setCity("banglore");
		a.setDoorno(10);
		a.setPin(562114);
		
		TechEmp t= new TechEmp();
		t.Bpay=100;
		t.eid=10;
		t.ename="kushal";
		t.obj=a;
		System.out.println("eid : "+t.eid);
		System.out.println("ename : "+t.ename);
		System.out.println("Adress : "+t.obj);
		System.out.println("salary for tech emp:"+t.salcal());
	}

}
