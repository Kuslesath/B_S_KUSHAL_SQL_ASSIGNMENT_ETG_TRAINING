package Day3_Assignments;

public class Tri extends Square{
	public int area(int h,int b) {
		this.a=h*b/2;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri r=new Tri();
		r.area(10,10);
		r.dis();
	}

}
