package MyOwnAutoShop;

public class Ford extends Car {
	
	int year;
	int mdisc;
	public Ford(int a,int b) {
		// TODO Auto-generated constructor stub
		this.year=a;
		this.mdisc=b;
	}
	public double getSalePrice() {
		double f=super.getSalePrice();
		return f-(f*this.mdisc/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford t=new Ford(2021,10);
		t.speed=200;
		t.regprice=500000;
		t.color="red";
		t.display();
		System.out.println("Manufacturing year is "+t.year);
		System.out.println("Manufacturing discount is "+t.mdisc+" %.");
		System.out.println("Sale Price is "+t.getSalePrice());

	}
}
