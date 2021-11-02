package Day3_Assignments;

public class Rect extends Square{

	public int area(int l,int b) {
		this.a=l*b;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r=new Rect();
		r.area(10,20);
		r.dis();
	}

}
