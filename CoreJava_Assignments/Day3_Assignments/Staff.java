package Day3_Assignments;

public class Staff extends Employee {

	String title;
	
	@Override
	 double salcal() {
		
		double hra=0.18*Bpay;
		return Bpay+hra;
		
	}
	
	@Override
	public String toString() {
		return "Staff [eid=" + eid + ", ename=" + ename +"]";
	}
	
	public static void main (String args[]) {
		Staff t= new Staff();
		Address a=new Address();
		a.setCity("banglore");
		a.setDoorno(10);
		a.setPin(562114);
		
		
		t.Bpay=100;
		t.eid=11;
		t.ename="Ram";
		t.obj=a;
		System.out.println("eid : "+t.eid);
		System.out.println("ename : "+t.ename);
		System.out.println("Adress : "+t.obj);
		System.out.println("salary for tech emp:"+t.salcal());
	
	}
	
}
