package Day3_Assignments;

public class Square {

	int a;
	
	public int area(int l) {
		this.a=l*l;
		return a;
	}
	public void dis() {
		System.out.println("Area of the figure is "+this.a+" squnits");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.area(10);
		s.dis();
	}

}
